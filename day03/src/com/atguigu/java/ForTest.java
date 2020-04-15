package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/15 15:27
 */
public class ForTest {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count + " -----"+ sum);
    }
}
