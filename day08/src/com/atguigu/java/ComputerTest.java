package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/23 11:06
 */
public class ComputerTest {
    public static void main(String[] args) {
        int[] number={1,2,2,3};
        Computer computer = new Computer();
        System.out.println(computer.sum(number));
        System.out.println("--------------------");
    }
}
class Computer{
    public int sum(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
}
