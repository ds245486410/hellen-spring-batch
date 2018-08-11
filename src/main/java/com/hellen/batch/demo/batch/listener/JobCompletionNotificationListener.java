package com.hellen.batch.demo.batch.listener;

import com.hellen.batch.demo.domain.User;
import com.hellen.batch.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {
    @Autowired
    private UserService userService;

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            List<User> users = userService.listAll();
            for (User user : users) {
                log.info("insert data [{}],[{}],[{}],[{}]",user.getName(),user.getPhone(),user.getPicture(),user.getSexName());
            }
        }
    }
}
