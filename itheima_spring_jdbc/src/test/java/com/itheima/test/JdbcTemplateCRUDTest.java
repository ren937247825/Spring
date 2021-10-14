package com.itheima.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        jdbcTemplate.update("UPDATE `ms_test`.`tab_category` SET `cname` = ? WHERE `cid` = ?", "ceshi", 3);

    }

    @Test
    public void testDelete() {
        jdbcTemplate.update("DELETE FROM `ms_test`.`tab_category` WHERE `cid` = ?", 3);

    }
}
