package com.sblog.service.impl;

import com.sblog.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author ysj
 * @date 2019-06-20
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String get() {
        return "service ok";
    }

}
