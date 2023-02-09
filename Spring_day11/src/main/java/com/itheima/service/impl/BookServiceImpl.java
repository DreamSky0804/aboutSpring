package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("bookService")
@Service("bookService")
public class BookServiceImpl implements BookService {


    @Override
    public void save() {
        System.out.println("book service save.....");
    }








}
