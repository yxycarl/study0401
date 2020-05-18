package com.atguigu.java;

import javax.swing.*;

/**
 * @author yxycarl
 * @date 2020/5/8 22:20
 */
public class EnumTest2 {
    public static void main(String[] args) {
//        System.out.println(Season2.SPRING);
        System.out.println(Season3.SPRING.getName());
        System.out.println("------values----");
        Season3[] values = Season3.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].getName());
        }
        System.out.println("------valueOf----");
        Season3 spring = Season3.valueOf("SPRING");
        System.out.println(spring.getName());
    }
}
enum Season3{
    SPRING("春天"), SUMMER("夏天"), AUTUMN("秋天"), WINTER("冬天");
    private final String name;

    private Season3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
enum Season2{
    SPRING, SUMMER, AUTUMN, WINTER;
}
