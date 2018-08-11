package com.hellen.batch.demo.user;

import com.alibaba.fastjson.JSON;
import com.hellen.batch.demo.HellenBatchApplicationTests;
import com.hellen.batch.demo.domain.User;
import com.hellen.batch.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class UserTest extends HellenBatchApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void testList(){
        List<User> users = userService.listAll();
        log.info(userService +"");
        log.info(JSON.toJSONString(users));
    }

    @Test
    public void testInset(){
        User user = new User();
        user.setName("zhgnsan1");
        user.setPhone("17199912306");
        user.setPicture("no picture");
        user.setSex(1);
        user.setCreateBy("system");
        user.setUpdateBy("system");
        Integer insert = userService.insert(user);
        log.info("insert result :[{}]",insert);
    }
}
