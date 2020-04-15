package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/15 16:06
 */
public class ShuixianhuaTest {
    public static void main(String[] args) {
        for (int i=1;i<=999;i++){
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
}
