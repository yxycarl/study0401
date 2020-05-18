package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author yxycarl
 * @date 2020/5/17 23:14
 */
public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            //1.创建Properties的对象
            Properties properties = new Properties();
            File file = new File("day15/resources/resources.properties");
            //2.创建一个输入流
            fis = new FileInputStream(file);
            //3.加载流
            properties.load(fis);
            //4.读取内容
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            System.out.println(username + " " + password);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            if(fis != null){
                //5.关流
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
