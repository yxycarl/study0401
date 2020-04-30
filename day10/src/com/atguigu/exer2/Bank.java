package com.atguigu.exer2;

/**
 * @author yxycarl
 * @date 2020/4/28 23:11
 */
/*
 	addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer对象，
 		然后把它放到 customer 数组中。还必须把 numberofCustomer 属性的值加 1。
	getNumOfCustomers 方法返回 numberofCustomers 属性值。
	getCustomer方法返回与给出的index参数相关的客户。
 */
public class Bank {
    private Customer[]customers=new Customer[10];
    private int numberCustomer;

    public void addCustomer(String firstName,String lastName){
        if (customers.length<numberCustomer){
            System.out.println("人员已满");
        }
        Customer c=new Customer(firstName,lastName);
        customers[numberCustomer++]=c;
    }

    public int getNumberCustomer() {
        return numberCustomer;
    }

    public Customer getCustomer(int index){
        if (index<0 || index >numberCustomer){
            System.out.println("找不到该用户");
        }
        return customers[index];
    }
}
