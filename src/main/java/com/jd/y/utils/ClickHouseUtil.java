/*
package com.jd.y.utils;

import com.jd.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.yandex.clickhouse.ClickHouseConnection;
import ru.yandex.clickhouse.ClickHouseDataSource;
import ru.yandex.clickhouse.settings.ClickHouseProperties;

import java.sql.*;
import java.util.*;

*/
/**
 * click house Connection util
 *
 * @author liuchunli3
 * @date 2019-04-01 12:00
 *//*

@Slf4j
@Component
public class ClickHouseUtil {

    private static String clickHouseAddress;

    private static String clickHouseUsername;

    private static String clickHousePassword;

    private static String clickHouseDB;

    private static Integer clickHouseSocketTimeout;

    @Value("${clickhouse.address}")
    public void setClickHouseAddress(String address) {
        ClickHouseUtil.clickHouseAddress = address;
    }

    @Value("${clickhouse.username}")
    public void setClickHouseUsername(String username) {
        ClickHouseUtil.clickHouseUsername = username;
    }

    @Value("${clickhouse.password}")
    public void setClickHousePassword(String password) {
        ClickHouseUtil.clickHousePassword = password;
    }

    @Value("${clickhouse.db}")
    public void setClickHouseDB(String db) {
        ClickHouseUtil.clickHouseDB = db;
    }

    public static String getClickHouseDB() {
        return ClickHouseUtil.clickHouseDB;
    }

    @Value("${clickhouse.socketTimeout}")
    public void setClickHouseSocketTimeout(Integer socketTimeout) {
        ClickHouseUtil.clickHouseSocketTimeout = socketTimeout;
    }


    public static Connection getConn() {

        ClickHouseConnection conn = null;
        ClickHouseProperties properties = new ClickHouseProperties();
        properties.setUser(clickHouseUsername);
        properties.setPassword(clickHousePassword);
        properties.setDatabase(clickHouseDB);
        properties.setSocketTimeout(clickHouseSocketTimeout);
        ClickHouseDataSource clickHouseDataSource = new ClickHouseDataSource(clickHouseAddress, properties);
        try {
            conn = clickHouseDataSource.getConnection();
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void createTable(String createSql) {
        log.info("create table sql：" + createSql);
        Connection connection = getConn();
        try {
            connection.createStatement().execute(createSql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insert(String sql) {
        Connection connection = getConn();
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<JSONObject> query(String sql) {
        log.info("cliockhouse 执行sql：" + sql);
        Connection connection = getConn();
        try {
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsmd = results.getMetaData();
            List<JSONObject> list = new ArrayList();
            while (results.next()) {
                JSONObject row = new JSONObject();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    row.put(rsmd.getColumnName(i), results.getString(rsmd.getColumnName(i)));
                }
                list.add(row);
            }

            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
*/
