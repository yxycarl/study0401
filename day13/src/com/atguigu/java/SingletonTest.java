package com.atguigu.java;

import sun.security.jca.GetInstance;

/**
 * @author yxycarl
 * @date 2020/5/6 15:54
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Bank3.getInstance());
        System.out.println(Bank3.getInstance());
        System.out.println(Bank3.getInstance());
        System.out.println(Bank3.getInstance());

    }
}
//恶汉式
class Bank{
    private Bank() {
    }
    private static Bank bank=new Bank();
    public static Bank getInstance(){
        return bank;
    }
}
//懒汉式
class Bank2{
    private Bank2(){
    }
    private static Bank2 bank=null;
    public static Bank2 getInstance2(){
        if (bank==null){
            bank=new Bank2();
        }
        return bank;
    }
}
//代码块
class Bank3{
    private Bank3() {
    }
    private static Bank3 bank=null;
    static {
        bank=new Bank3();
    }
    public static Bank3 getInstance(){
        return bank;
    }
}
