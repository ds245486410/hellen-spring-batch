package com.hellen.batch.demo.batch.writer;

import com.hellen.batch.demo.domain.User;
import com.hellen.batch.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class UserItemWriter implements ItemWriter<User> {

    @Resource
    private UserMapper userMapper;

    @Override
    public void write(List<? extends User> items) throws Exception {
        for (User item : items) {
            Integer insert = userMapper.insert(item);
            log.info("insert result [{}],{{}},[{}]",insert,item.getName(),item.getPhone());
        }
    }
}
