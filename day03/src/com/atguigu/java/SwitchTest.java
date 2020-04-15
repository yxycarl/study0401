package com.atguigu.java;
import java.util.Scanner;

/**
 * @author yxycarl
 * @date 2020/4/15 14:22
 */
public class SwitchTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("年");
        int year=s.nextInt();
        System.out.println("月");
        int month=s.nextInt();
        System.out.println("日");
        int day=s.nextInt();
        int sumday=0;
        switch (month){
            case 3:
                if((year % 4 == 0 && year % 100 !=0)  || (year % 400 == 0)){
                    sumday=28+sumday;
                }else{
                    sumday=28+sumday;
                }
            case 2:
                sumday=31+sumday;
            case 1:
                sumday=sumday+day;
                break;
        }
        System.out.println(sumday);
    }
}
