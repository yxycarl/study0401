package com.atguigu.exer;

/**
 * @author yxycarl
 * @date 2020/5/4 18:34
 */
public class Test {
    public static void main(String[] args) {
        	/*
		 *  写一个用户程序测试CheckAccount类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，
		 *  可透支限额为5000元的CheckAccount对象。
			使用withdraw方法提款5000元，并打印账户余额和可透支额。
			再使用withdraw方法提款18000元，并打印账户余额和可透支额。
			再使用withdraw方法提款3000元，并打印账户余额和可透支额。

		 */
        CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 5000);
        ca.withdraw(5000);
        System.out.println(ca.getBalance() + "\t" + ca.getOverdraft());
        System.out.println("-------------------");
        ca.withdraw(18000);
        System.out.println(ca.getBalance() + "\t" + ca.getOverdraft());
        System.out.println("-------------------");
        ca.withdraw(3000);
        System.out.println(ca.getBalance() + "\t" + ca.getOverdraft());


    }
}
