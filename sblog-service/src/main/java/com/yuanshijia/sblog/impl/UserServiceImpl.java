//package com.sblog.api.impl;
//
//import cn.hutool.core.bean.BeanUtil;
//import com.sblog.api.api.UserService;
//import Response;
//import UserVO;
//import UserBody;
//import ParamUtil;
//import User;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.dubbo.config.annotation.Service;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.IncorrectCredentialsException;
//import org.apache.shiro.authc.LockedAccountException;
//import org.apache.shiro.authc.UnknownAccountException;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
//
///**
// * @author ysj
// * @date 2019-06-20
// */
//@Service
//@Slf4j
//public class UserServiceImpl implements UserService {
//    @Override
//    public String get() {
//        return "api ok";
//    }
//
//    @Override
//    public Response login(String username, String password, Boolean rememberMe) {
//
//        ParamUtil.notNull(username);
//        ParamUtil.notNull(password);
//
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
//
//        Subject subject = SecurityUtils.getSubject();
//
//        String sessionId = null;
//        try {
//            // 密码交给shiro去认证
//            subject.login(token);
//            /**
//             * 登录成功则返回sessionId作为token给前端存储，前端请求时将该token放入请求头，以Authorization为key，以此来鉴权。如果出现账号或密码错误等异常则返回错误信息。
//             */
//            sessionId = subject.getSession().getId().toString();
//
//        }catch (UnknownAccountException e){
//            log.info("用户不存在");
//            return Response.error(e.getMessage());
//        } catch (IncorrectCredentialsException e) {
//            log.info("密码不正确");
//            return Response.error("密码不正确");
//        }catch (LockedAccountException e) {
//            log.info("账号被禁用");
//            return Response.error(e.getMessage());
//        }  catch (Exception e) {
//            log.info("发现未知异常");
//            return Response.error(e.getMessage());
//        }
//
//        // 获取登录的用户
//        User user = (User) subject.getPrincipal();
//
//        UserVO userVO = new UserVO();
//        BeanUtil.copyProperties(user, userVO);
//        userVO.setToken(sessionId);
//
//        // 往缓存添加用户信息
//        // todo 往缓存添加用户信息
////        redisService.add(userVO);
//
//        log.info("登入成功：{}", username);
////        return Response.successMsg("登入成功", userVO);
//        return Response.successMsg("登入成功", userVO);
//    }
//
//    @Override
//    public Response register(UserBody userBody) {
//        return null;
//    }
//
//    @Override
//    public Response validUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public Response validEmail(String email) {
//        return null;
//    }
//
//    @Override
//    public User selectById(String id) {
//        return null;
//    }
//
//    @Override
//    public User selectUserByUsername(String username) {
//        return null;
//    }
//
//    @Override
//    public Response updateUser(User user) {
//        return null;
//    }
//
//}
