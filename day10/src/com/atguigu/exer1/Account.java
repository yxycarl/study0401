package com.atguigu.exer1;

/**
 * @author yxycarl
 * @date 2020/4/28 22:19
 */
/*
 * 1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；包含的方法：
 * 访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
 */
public class Account {
    private int id;
    private int balance;
    private double annualInterestRate;

    public void withdraw(int a){
        if (a<balance){
            balance-=a;
        }else {
            System.out.println("账户余额不足");
        }
    }
    public void deposit(int b){
        balance+=b;
    }

    public Account(int id, int balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
