package com.atguigu.com;

import java.sql.*;
import com.mysql.jdbc.Driver;
/**
 * @author yxycarl
 * @date 2020/5/21 9:48
 */
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //		 *      2.1 注册mysql驱动
//        DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        Statement statement = null;
//		 *      2.2 获取数据库连接
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/girls", "root", "root");
//		 *      2.3 编写sql语句
            String sql = "insert into beauty(name) values('hello jdbc2')";
//		 *      2.4 获取SQL执行对象
            statement = connection.createStatement();
//		 *      2.5 执行SQL获取结果
            int i = statement.executeUpdate(sql);

            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
//		 *      2.6 关闭数据库相关资源
            if(statement != null){
                statement.close();
            }

            if(connection != null){
                connection.close();
            }
        }
    }
}
