package com.imooc.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/*
 * MyBatisUtils 工具类，创建全局唯一的sqlSessionFactory对象
 * */
public class MyNatisUtils {
    //利用static（静态）属于类不属于对象，且全局唯一
    private static SqlSessionFactory sqlSessionFactory = null;

    //利用静态块在初始化类时实例化sqlSessionFactory
    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            //初始化错误时，通过抛出异常ExceptionInInitializerError通知调用者
            throw new ExceptionInInitializerError(e);
        }
    }

    Reader reader = null;

    /*
     *释放一个有效的sqlSession对象
     * @param SqlSession 对象
     * */
    public static void closeSession(SqlSession session) {
        if (session != null) {
            session.close();
        }
    }

    /*
     * openSession 创建一个新的SqlSession 对象
     * @return SqlSession对象
     * */
    public SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }
}
