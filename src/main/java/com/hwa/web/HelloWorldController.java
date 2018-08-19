package com.hwa.web;

import com.hwa.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuHua
 * @date 2018/8/2
 */
@RestController
public class HelloWorldController {
    @RequestMapping()
    public User getUser() {
        User user = new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
}
