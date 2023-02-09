package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //被重写后,在方法中进行对象的创建并返回
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
   //被重写后,主要返回创建类的Class对象
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
