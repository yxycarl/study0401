package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/15 16:17
 */
public class FoobizbazTest {
    public static void main(String[] args) {
        for (int i=1;i<=150;i++){
            System.out.print(i+" ");
            if (i%3==0){
                System.out.print("foo");
            }
            if (i%5==0){
                System.out.print("biz");
            }
            if (i%7==0){
                System.out.print("baz");
            }
            System.out.println();
        }
    }
}
