package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao1;

    public void setBookDao1(BookDao bookDao1) {
        System.out.println("set .....");
        this.bookDao1 = bookDao1;
    }



    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }

    @Override
    public void save() {
        bookDao1.save();
        System.out.println("service.....");
    }
}
