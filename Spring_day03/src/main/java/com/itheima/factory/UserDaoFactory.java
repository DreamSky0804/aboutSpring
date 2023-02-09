package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
//实例工厂
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();

    }
}
