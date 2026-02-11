package com.imooc.jdbc.goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Query3 {
    //查询并打印所有商品
    public static void printAllGoods(Connection conn) throws Exception {
        String sql = "SELECT id,name,price,desp,create_time FROM goods";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String desp = rs.getString("desp");
                System.out.println(id + "\t" + name + "\t" + price + "\t" + desp);
            }
        }
    }

    //1)为goods 表添加一条新数据
    public static void addGoods(Connection conn) throws Exception {
        String sql = "INSERT INTO goods(name,price,desp,create_time) VALUES (?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "电视机");
            ps.setDouble(2, 2999);
            ps.setString(3, "等离子电视");
            ps.setDate(4, java.sql.Date.valueOf("1949-10-01"));
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("添加成功，当前goods表数据如下：");
                printAllGoods(conn);
            } else {
                System.out.println("添加失败");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        try (Connection conn = DBUtil.getConnection()) {
            addGoods(conn);
        }
    }
}
