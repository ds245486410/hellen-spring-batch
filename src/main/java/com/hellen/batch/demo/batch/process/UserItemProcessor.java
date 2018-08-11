package com.hellen.batch.demo.batch.process;

import com.hellen.batch.demo.domain.User;
import com.hellen.batch.demo.dto.PreUser;
import org.springframework.batch.item.ItemProcessor;

import java.util.Date;

public class UserItemProcessor implements ItemProcessor<PreUser,User> {
    @Override
    public User process(PreUser item) throws Exception {
        User user = new User();
        user.setUpdateBy("system");
        user.setCreateBy("system");
        user.setUpdateAt(new Date());

        user.setSex(item.getSex());
        user.setPicture(item.getPicture());
        user.setPhone(item.getName());
        user.setName(item.getName());
        return user;
    }
}
