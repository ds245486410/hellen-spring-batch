package com.hellen.batch.demo.user;

import com.hellen.batch.demo.HellenBatchApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class TestDatasource extends HellenBatchApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Test
    public void tst(){
        System.out.println(this.dataSource);
    }
}
