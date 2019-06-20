package com.sblog.api.service;

import com.sblog.common.dto.Response;
import com.sblog.common.request.UserBody;
import com.sblog.dao.entity.User;

/**
 * @author ysj
 * @date 2019-06-20
 */
public interface UserService {
    String get();

    /**
     * 登录
     * @param username
     * @param password
     * @param rememberMe
     * @return
     */
    Response login(String username, String password, Boolean rememberMe);

    /**
     * 注册
     * @param userBody
     * @return
     */
    Response register(UserBody userBody);


    /**
     * 验证用户名是否存在
     * @param username
     * @return
     */
    Response validUsername(String username);

    /**
     * 验证邮箱是否存在
     * @param email
     * @return
     */
    Response validEmail( String email);


    /**
     * 根据用户id获取用户信息
     * @return
     */
    User selectById(String id);

    /**
     * 根据用户名获取用户
     */
    User selectUserByUsername(String username);

    /**
     * 更新用户信息
     */
    Response updateUser(User user);

}
