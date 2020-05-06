package com.atguigu.exer;

/**
 * @author yxycarl
 * @date 2020/5/4 18:18
 */
public class Account {
    private int id; //账户
    private double balance;//余额
    private double annualInterestRate;//年利率



    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw (double amount){//取钱
        //需要判断余额是否充足
        if(amount > balance){
            System.out.println("余额不足");
        }else{
            balance -= amount;
        }
    }


    public void deposit (double amount){//存钱
        balance += amount;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

}
