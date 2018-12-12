package com.wit.customer.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtil {

    private static SqlSessionFactory factory;

    private MyBatisUtil() {
    }

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        factory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return factory;
    }

    public static SqlSession openSqlSession() {
        return openSqlSession(true);
    }

    public static SqlSession openSqlSessionWithoutAutoCommit() {
        return openSqlSession(false);
    }

    private static SqlSession openSqlSession(boolean autoCommit) {
        return factory.openSession(autoCommit);
    }
}
