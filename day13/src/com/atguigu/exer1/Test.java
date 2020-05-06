package com.atguigu.exer1;

/**
 * @author yxycarl
 * @date 2020/5/5 14:32
 */
public class Test {
    public static void main(String[] args) {
        Circle blue = new Circle("blue", 2.0, 2.0);
        Circle blue2 = new Circle("blue", 2.0, 3.0);
        System.out.println(blue.equals(blue2));
        System.out.println(blue.toString());
        System.out.println(blue2.toString());
    }
}
