package com.hellen.batch.demo.mapper;


import com.hellen.batch.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> listAll();
    Integer insert(User user);
}
