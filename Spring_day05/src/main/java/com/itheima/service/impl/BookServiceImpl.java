package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.BookService;


public class BookServiceImpl implements BookService {
    private BookDao bookDao1;
    private UserDao userDao;
    private String databaseName;
    private int connectionNum;

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }



    public void setBookDao1(BookDao bookDao1) {
        System.out.println("set .....bookDao1");
        this.bookDao1 = bookDao1;
    }
    public void setUserDao(UserDao userDao) {
        System.out.println("set .....userDao");
        this.userDao = userDao;
    }


    @Override
    public void save() {
//        bookDao1.save();
//        userDao.save();
//        System.out.println("service.....");
        System.out.println("..."+databaseName+","+connectionNum);
    }






}
