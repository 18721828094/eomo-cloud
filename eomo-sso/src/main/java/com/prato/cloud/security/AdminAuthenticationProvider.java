package com.prato.cloud.security;

import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AdminAuthenticationProvider implements AuthenticationProvider {
    protected MessageSourceAccessor messages = SpringSecurityMessageSource.getAccessor();

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        AdminAuthenticationToken token = (AdminAuthenticationToken) authentication;
        String username = token.getUsername();
        String password = token.getCredentials().toString();
        UserDetails loadedUser = null;
        try {
            loadedUser = new UserDetailsImpl(username, password, this.getGrantedAuthorityList());
        } catch (UsernameNotFoundException notFound) {
            throw notFound;
        } catch (Exception repositoryProblem) {
            throw new InternalAuthenticationServiceException(
                    repositoryProblem.getMessage(), repositoryProblem);
        }
        if (loadedUser == null) {
            LoggerUtil.error("UserDetailsService returned null, which is an interface contract violation.");
            throw new InternalAuthenticationServiceException(
                    "UserDetailsService returned null, which is an interface contract violation");
        }
        try {
            additionalAuthenticationChecks(loadedUser, token);
        } catch (AuthenticationException exception) {
            LoggerUtil.error("Username and password are invalid.", exception);
            throw exception;
        }
        token.setPrincipal(loadedUser);
        token.setDetails(loadedUser);
        token.setAuthorities(loadedUser.getAuthorities());
        authentication.setAuthenticated(true);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return authentication;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(AdminAuthenticationToken.class);
    }
}
