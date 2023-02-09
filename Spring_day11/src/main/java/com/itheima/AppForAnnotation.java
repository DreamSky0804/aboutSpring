package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext加载Spring配置类初始化Spring容器
    ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringConfig.class);
        //按类型获取bean
    BookDao bookDao=ctx.getBean(BookDaoImpl.class);
    System.out.println(bookDao);
    BookDao bookDao1=ctx.getBean(BookDaoImpl.class);
    System.out.println(bookDao1);
    BookService bookService = (BookService) ctx.getBean("bookService");
    System.out.println(bookService);

    }
}
