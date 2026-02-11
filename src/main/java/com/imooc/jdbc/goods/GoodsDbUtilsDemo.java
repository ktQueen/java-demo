package com.imooc.jdbc.goods;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

public class GoodsDbUtilsDemo {
    public static void main(String[] args) throws Exception {
        DataSource ds = DruidUtil.getDataSource();
        QueryRunner runner = new QueryRunner(ds);

        //1.插入一条“照相机 5000.0防水，索尼1999-01-30”
        String insertSql = "INSERT INTO goods(name,price,desp,create_time) VALUES (?,?,?,?)";
        Object[] params = {
                "照相机",
                5000.0,
                "防水，索尼",
                Date.valueOf("1999-01-30")
        };
        int rows = runner.update(insertSql, params);
        if (rows > 0) {
            System.out.println("添加成功");
            //2.查询所有数据并打印
            String querySql = "SELECT id,name,price,desp,create_time FROM goods";
            List<Goods> list = runner.query(querySql, new BeanListHandler<>(Goods.class));
            for (Goods g : list) {
                System.out.println(g);
            }
        } else {
            System.out.println("添加失败");
        }
    }
}
