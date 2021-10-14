package com.itheima.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class JdbcTemplateTest {

    @Test
    public void test2() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        int i = jdbcTemplate.update("INSERT INTO `ms_test`.`tab_category`(`cid`, `cname`) VALUES (?, ?)", "4", "rjf211");
        System.out.println(i);

    }

    @Test
    public void test1() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ms_test");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        int i = jdbcTemplate.update("INSERT INTO `ms_test`.`tab_category`(`cid`, `cname`) VALUES (?, ?)", "3", "rjf21");
        System.out.println(i);

    }
}
