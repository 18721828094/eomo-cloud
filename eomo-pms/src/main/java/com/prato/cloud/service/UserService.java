package com.prato.cloud.service;

import com.prato.cloud.entity.User;

import java.util.List;

/**
 * @author Albert Ge
 * @version 1.2.0
 * @ClassName: UserService
 * @Description: 用户Service继承BaseService
 * @date 2018年4月5日
 */
public interface UserService {
    /**
     * 查找全部用户
     *
     * @return
     */
    public List<User> findAll();

    /**
     * 判断用户名是否存在
     *
     * @param username
     * @return
     */
    public boolean isExists(String username);

    /**
     * 根据id删除用户
     * @param id
     */
    public void delete(Long id);
}