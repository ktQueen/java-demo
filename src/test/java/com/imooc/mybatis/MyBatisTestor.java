package com.imooc.mybatis;

import com.imooc.jdbc.goods.Goods;
import com.imooc.mybatis.utils.MyNatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.List;

//JUNIT单元测试类

public class MyBatisTestor {
    @Test
    public void testSqlSessionFactory() throws IOException {
        //利用Reader加载classpath 下的mybatis.xml核心配置文件
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        //初始化SqlSessionFactory 对象，同时解析mybatis.xml文件
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        System.out.println("SessionFactory加载成功");
        SqlSession sqlSession = null;
        //创建SqlSession对象，SqlSession是JDBC的扩展类，用于与数据库交互
        try {
            sqlSession = sqlSessionFactory.openSession();
            //创建数据库连接（测试用）
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                //如果type="POOLED,代表使用连接池，close则是将连接回收到连接池中
                //如果type="UNPOOLED,代表直连，close则会效用Connection.close()方法关闭连接
                sqlSession.close();
            }
        }

    }

    @Test
    public void testMyBatisUtils() {
        SqlSession sqlSession = null;
        MyNatisUtils MyBatisUtils = new MyNatisUtils();
        sqlSession = MyBatisUtils.openSession();
        Connection connection = sqlSession.getConnection();
        System.out.println(connection);
        MyBatisUtils.closeSession(sqlSession);
    }

    @Test
    public void testSelectAllGoods() throws Exception {
        // 1. 加载 mybatis 核心配置
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

        // 2. 打开会话
        try (SqlSession sqlSession = factory.openSession()) {
            // 3. 调用 mapper 中的 selectAll（namespace.id）
            List<Goods> list = sqlSession.selectList("goods.selectAll");
            // 4. 打印结果
            for (Goods g : list) {
                System.out.println(g);
            }
        }
    }

    @Test
    public void testSelectGoodsById() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

        try (SqlSession sqlSession = factory.openSession()) {
            // 假设表里有 id = 1 的数据
            Goods goods = sqlSession.selectOne("goods.selectById", 1);
            System.out.println(goods);
        }
    }
}
