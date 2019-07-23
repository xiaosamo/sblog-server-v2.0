package com.yuanshijia.sblog.api;

import com.yuanshijia.sblog.dto.Response;
import com.yuanshijia.sblog.dto.UserDTO;

/**
 * @author ysj
 * @date 2019-06-20
 */
public interface UserService {
    String get();

    /**
     * 登录
     *
     * @param username
     * @param password
     * @param rememberMe
     * @return
     */
    Response<Boolean> login(String username, String password, Boolean rememberMe);

    /**
     * 注册
     * @param userBody
     * @return
     */
//    boolean register(UserBody userBody);


    /**
     * 验证用户名是否存在
     * @param username
     * @return
     */
    Response<Boolean> validUsername(String username);

    /**
     * 验证邮箱是否存在
     * @param email
     * @return
     */
    Response<Boolean> validEmail( String email);


    /**
     * 根据用户id获取用户信息
     * @return
     */
    Response<UserDTO> selectById(String id);

    /**
     * 根据用户名获取用户
     */
    Response<UserDTO> selectUserByUsername(String username);

    /**
     * 更新用户信息
     */
    Response<Boolean> updateUser(UserDTO user);

}
