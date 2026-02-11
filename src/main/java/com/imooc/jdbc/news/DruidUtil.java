package com.imooc.jdbc.news;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class DruidUtil {
    private static DataSource dataSource;

    static {
        try {
            Properties prop = new Properties();
            InputStream in = DruidUtil.class
                    .getClassLoader()
                    .getResourceAsStream("druid.properties");
            prop.load(in);
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
