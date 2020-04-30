package com.atguigu.exer1;

/**
 * @author yxycarl
 * @date 2020/4/28 22:26
 */
/*
* （1）	创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息
		对象的关联 ： a对象中的属性的值是b对象的地址值。
		可以通过a对象中的属性获取b对象的地址值，然后对b对象进行操作
	 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith",
                new Account(1000, 2000, 0.0123));
        customer.getAccount().deposit(100);
        System.out.println(customer.getAccount().getBalance());
        customer.getAccount().withdraw(960);
        System.out.println(customer.getAccount().getBalance());
        customer.getAccount().withdraw(2000);
    }
}
