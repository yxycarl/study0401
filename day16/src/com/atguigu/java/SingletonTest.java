package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/5/18 21:47
 */
public class SingletonTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <100 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Singleton.getInstance());
                }
            }).start();
        }
    }
}
class Singleton{
    private Singleton(){ }
    private static Singleton only=null;
    public static Singleton getInstance() {
        synchronized (Singleton.class){
            if (only==null){
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                only=new Singleton();
            }
            return only;
        }
    }
}
