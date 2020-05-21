package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/5/18 17:13
 */
public class ThreadTest {
    public static void main(String[] args) {
        //实现Runnable接口
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("黄帅好嗨哟~~~"+i);
                }
            }
        });
        t1.start();

        //继承Thread类的方式
        Thread t2 = new Thread(){
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("小龙哥好嗨哟~~~"+i);
                }
            }
        };
        t2.start();
    }
}
