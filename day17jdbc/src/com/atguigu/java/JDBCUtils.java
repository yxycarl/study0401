package com.atguigu.java;

import com.alibaba.druid.pool.DruidDataSourceFactory;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author yxycarl
 * @date 2020/5/21 21:02
 */
public class JDBCUtils {
    private static DataSource ds;
    private static ThreadLocal<Connection> threadLocal;

    static {
        try {
            // 加载外部属性文件
            Properties prop = new Properties();
            prop.load(JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            // 初始化连接池
            ds = DruidDataSourceFactory.createDataSource(prop);
            // 初始化保存数据库连接的线程对象
            /*
             * ThreadLocal 类 可以在当前线程中保存对象 可以保证同一个用户同一次操作数据库用的数据库连接是同一个
             */
            threadLocal = new ThreadLocal<>();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * 从连接池获取数据库连接并返回
     */
    public static Connection getConnection() throws SQLException {
        // 先查询当前线程中是否有数据库连接
        Connection conn = threadLocal.get();
        // 判断当前线程中是否有数据库连接
        if (conn == null) {
            // 从连接池中获取数据库连接
            conn = ds.getConnection();
            // 将数据库连接保存到当前线程中
            threadLocal.set(conn);
        }
        return conn;
    }

    /*
     * 关闭数据库连接
     */
    public static void closeConnection() {
        // 先查询当前线程中是否有数据库连接
        Connection conn = threadLocal.get();
        if(conn!=null){
            try {
                //将数据库连接返回连接池
                conn.close();
                //将当前线程中的数据库连接移除
                threadLocal.remove();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
