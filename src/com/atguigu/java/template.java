package com.atguigu.java;

import javax.print.DocFlavor;
import javax.xml.bind.PrintConversionEvent;
import java.util.ArrayList;

/**
 * @author yxycarl
 * @date 2020/4/2 16:02
 */
public class template {

    
    public static void main(String[] args) {

        System.out.println("args = [" + args + "]");
        int a=10;
        System.out.println("a = " + a);
        System.out.println("template.main");
        String[] s = new String[]{"tom","yxy","jyj"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String s1 : s) {
            System.out.println(s1);
        }
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        if (list == null) {
            
        }
        if (list != null) {

        }

    }
    public void method(){
        System.out.println("template.method");
    }

}
