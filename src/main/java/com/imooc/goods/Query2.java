package com.imooc.goods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Query2 {
    //查询并打印所有商品
    public static void printAllGoods(Connection conn) throws Exception {
        String sql = "SELECT id,name,price,desp FROM goods";
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
        String sql = "INSERT INTO goods(name,price,desp) VALUES (?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "耳机");
            ps.setDouble(2, 200.0);
            ps.setString(3, "蓝牙耳机");
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("添加成功，当前goods表数据如下：");
                printAllGoods(conn);
            } else {
                System.out.println("添加失败");
            }
        }
    }

    //2）把goods 表中“手机”的价格改为1999
    public static void updatePhonePrice(Connection conn) throws Exception {
        String sql = "UPDATE goods SET price=? WHERE name=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, 1999.0);
            ps.setString(2, "手机");
            int rows = ps.executeUpdate();
            System.out.println("更新手机价格影响行数：" + rows);
        }
    }

    //3)删除goods 表中“空调”的数据
    public static void deleteAirConditioner(Connection conn) throws Exception {
        String sql = "DELETE FROM goods WHERE name=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "空调");
            int rows = ps.executeUpdate();
            System.out.println("删除空调影响行数：" + rows);
        }
    }

    public static void main(String[] args) throws Exception {
        try (Connection conn = DBUtil.getConnection()) {
            //1.添加“耳机”
            addGoods(conn);
            //2.修改“”手机“ 的价格为1999
            updatePhonePrice(conn);
            //3.删除“空调”
            deleteAirConditioner(conn);
            System.out.println("最终 goods 表数据：");
            printAllGoods(conn);
        }
    }
}
