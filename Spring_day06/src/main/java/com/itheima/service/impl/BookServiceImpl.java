package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.BookService;


public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    public BookServiceImpl(BookDao bookDao){
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        bookDao.save();
        System.out.println("book service save.....");
    }






}
