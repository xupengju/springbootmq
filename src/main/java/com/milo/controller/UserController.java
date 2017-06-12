package com.milo.controller;

import com.milo.entity.User;
import com.milo.rm.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Milo on 2017/6/8.
 */
//@EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Send send;
    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }

    @RequestMapping("/test")
    public String test(){
        String content = "test";
        send.sendMsg(content);
        return "";
    }


}
