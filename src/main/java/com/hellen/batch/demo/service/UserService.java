package com.hellen.batch.demo.service;

import com.hellen.batch.demo.domain.User;

import java.util.List;

public interface UserService {
    List<User>  listAll();
    Integer insert(User user);
}
