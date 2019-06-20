package com.sblog.web.controller;

import com.sblog.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ysj
 * @date 2019-06-20
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping
    public String test(){
        return userService.get();
    }

}
