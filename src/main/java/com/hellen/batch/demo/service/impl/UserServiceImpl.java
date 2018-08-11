package com.hellen.batch.demo.service.impl;

import com.hellen.batch.demo.domain.User;
import com.hellen.batch.demo.mapper.UserMapper;
import com.hellen.batch.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        return userMapper.listAll();
    }

    @Override
    public Integer insert(User user) {
        return userMapper.insert(user);
    }
}
