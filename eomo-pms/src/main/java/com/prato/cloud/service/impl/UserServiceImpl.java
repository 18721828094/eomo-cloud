package com.prato.cloud.service.impl;

import com.prato.cloud.entity.User;
import com.prato.cloud.repository.UserRepository;
import com.prato.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 用户Service层接口实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private SessionRegistry sessionRegistry;

    @Autowired
    protected UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean isExists(String username) {
        return false;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
