package com.atguigu.exer2;

import javax.sound.midi.Soundbank;

/**
 * @author yxycarl
 * @date 2020/4/28 22:26
 */

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("yxy","jyj");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(100);
        bank.getCustomer(0).getAccount().deposit(200);
        System.out.println(bank.getCustomer(0).getAccount().getBalance());

    }
}
