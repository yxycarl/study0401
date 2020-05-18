package com.atguigu.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author yxycarl
 * @date 2020/5/18 11:19
 */
public class FileinputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("day15\\aaa.txt");
        FileInputStream fis = new FileInputStream(file);
        int read = fis.read();
        while(read!=-1){
            System.out.println(read);
            read = fis.read();
        }
        fis.close();
    }
}
