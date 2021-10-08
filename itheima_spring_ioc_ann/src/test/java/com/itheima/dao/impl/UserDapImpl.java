package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("userDao")
@Repository("userDao")
public class UserDapImpl implements UserDao {
    public void save() {
        System.out.println("save 执行了。。。。");
    }
}
