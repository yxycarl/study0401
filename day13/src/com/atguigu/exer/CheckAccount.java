package com.atguigu.exer;

/**
 * @author yxycarl
 * @date 2020/5/4 18:20
 */
public class CheckAccount extends Account {
    /*创建Account类的一个子类CheckAccount代表可透支的账户，
     * 该账户中定义一个属性overdraft代表可透支限额。在CheckAccount类中重写withdraw方法，其算法如下：*/
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        /*
		 *  如果（取款金额<=账户余额）， //不透支
				1.可直接取款
			如果（取款金额>账户余额）， //需要透支
			      1.计算需要透支的额度
				  2.判断可透支额overdraft是否足够支付本次透支需要，如果可以
					将账户余额修改为0，冲减可透支金额
			如果不可以
				提示用户超过可透支额的限额
		 */
        if (amount<=getBalance()){
            super.withdraw(amount);
        }else if (amount>getBalance()){
            double overMoney=amount-getBalance();
            if (overdraft>overMoney){
                setBalance(0);
                overdraft-=overMoney;
            }else {
                System.out.println("不可透支");
            }
        }
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}