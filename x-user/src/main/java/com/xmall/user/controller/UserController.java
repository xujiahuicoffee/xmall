package com.xmall.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujiahui
 * @ClassName UserController
 * @description: TODO
 * @time 2023/8/4 15:23
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping(value = "/queryById")
    public String queryById(@RequestParam Long userId) {
        return "小明" +userId;
    }

}
