package com.imooc.goods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Query1 {
    public static void main(String[] args) throws Exception {

        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.建立链接
        String url = "jdbc:mysql://localhost:3306/goods?useSSl=false&serverTimezone=UTC&characterEncoding=utf8";
        String user = "root";
        String password = "kt123456";
        Connection conn = DriverManager.getConnection(url, user, password);

        //3.预编译SQL：查询价格再1500～3500之间的商品
        //查询价格在3500以下的商品信息
//        String sql = "SELECT id,name,price,desp From goods WHERE price<=? ";
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setDouble(1, 3500.0);
        //查询价格在1500以上到3500以下的商品信息
        String sql = "SELECT id,name,price,desp From goods WHERE price>? AND price<=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, 1500.0);
        ps.setDouble(2, 3500.0);

        //4.执行查询
        ResultSet rs = ps.executeQuery();

        //5.遍历结果集，在控制台打印
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double price = rs.getDouble("price");
            String desp = rs.getString("desp");
            System.out.println(id + "\t" + name + "\t" + price + "\t" + desp);
        }

        //6.关闭资源
        rs.close();
        ps.close();
        conn.close();
    }
}
