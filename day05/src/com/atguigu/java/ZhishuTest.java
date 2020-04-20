package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/16 22:10
 */
public class ZhishuTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for(int i = 2; i <= 100; i++){
            boolean boo = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    boo = false;
                    break;//一旦测到j是某个数时可以被整除，那么后面的数字(j)就不用再检测
                }
            }

            if(boo){
                System.out.println(i);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("time=" + (end - start));

    }
}
