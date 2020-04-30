package com.atguigu.java;
/**
 * @author yxycarl
 * @date 2020/4/28 11:35
 */
public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy("小龙哥", 30);
        Girl girl = new Girl("小苍老师", 15);
        girl.marry(boy);
        System.out.println("-------------------");
        Girl girl2 = new Girl("小泽老师", 14);
        girl.compare(girl2);
    }
}
