package com.prato.cloud.repository;

import com.prato.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User findByUserName(String username);
}
