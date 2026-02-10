package com.imooc.goods;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GoodsQueryByDruid {
    public static void main(String[] args) throws Exception {
        DataSource ds = DruidUtil.getDataSource();
        try (Connection conn = ds.getConnection()) {
            String sql = "SELECT id,name,price,desp,create_time FROM goods";
            try (PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    double price = rs.getDouble("price");
                    String desp = rs.getString("desp");
                    Date createTime = rs.getDate("create_time");
                    System.out.println(id + "\t" + name + "\t" + price + "\t" + desp + "\t" + createTime);
                }
            }
        }
    }
}
