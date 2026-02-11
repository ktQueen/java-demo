package com.imooc.jdbc.news;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

public class NewsDao {
    private final QueryRunner runner;

    public NewsDao(DataSource ds) {
        this.runner = new QueryRunner(ds);
    }


    //添加新闻
    public int add(String title, String content, java.util.Date createTime) throws Exception {
        String sql = "INSERT INTO news(title,content,create_time) VALUES (?,?,?)";
        return runner.update(sql, title, content, new Date(createTime.getTime()));
    }

    //查询新闻
    public List<News> findAll() throws Exception {
        String sql = "SELECT id,title,content,create_time FROM news ORDER BY id";
        return runner.query(sql, new BeanListHandler<>(News.class));
    }

    //根据id 查询
    public News findById(int id) throws Exception {
        String sql = "SELECT id,title,content,create_time FROM news WHERE id=?";
        return runner.query(sql, new BeanHandler<>(News.class), id);
    }

    //编辑新闻(根据id 修改title和content)
    public int update(int id, String title, String content) throws Exception {
        String sql = "UPDATE news SET title=?, content=?  WHERE id=?";
        return runner.update(sql, title, content, id);
    }

    //删除新闻
    public int delete(int id) throws Exception {
        String sql = "DELETE FROM news WHERE id=?";
        return runner.update(sql, id);
    }
}
