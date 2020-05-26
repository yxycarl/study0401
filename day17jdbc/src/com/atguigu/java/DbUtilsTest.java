package com.atguigu.java;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

/**
 * @author yxycarl
 * @date 2020/5/21 21:00
 */
public class DbUtilsTest {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql = "insert into boys(boyname,usercp) values(?,?)";
//        sql = "update boys set boyname = ? where id = ?";
//        sql = "delete from boys where id = ?";
        int i = qr.update(JDBCUtils.getConnection(), sql,"yxy",500);
        System.out.println(i);
    }
    /* query方法
     * 查询一条记录
     * BeanHandler 将查询结果自动封装为对应类的对象
     */
    @Test
    public void test2() throws Exception{
        QueryRunner qr = new QueryRunner();
        String sql = "select id,boyname,usercp from boys where id = ?";
        Boy boy = qr.query(JDBCUtils.getConnection(), sql, new BeanHandler<>(Boy.class), 4);
        System.out.println(boy);
    }
    @Test
    public void test3(){
        QueryRunner qr = new QueryRunner();
        try {
            String sql = "select * from boys";
            List<Boy> list = qr.query(JDBCUtils.getConnection(), sql, new BeanListHandler<>(Boy.class));
            System.out.println(list);
//            for (Boy boy : list) {
//                System.out.println(boy);
//            }
            Iterator<Boy> iterator = list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /* query方法
     * 查询单个值
     * ScalarHandler 会将结果赋值给Object类型
     */
    @Test
    public void test4() throws SQLException {
        QueryRunner qr = new QueryRunner();
        String sql="select count(*) from boys";
        Object query = qr.query(JDBCUtils.getConnection(), sql, new ScalarHandler());
        System.out.println(query);

    }



}
