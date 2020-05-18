package com.atguigu.exer;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Arrays;

/**
 * @author yxycarl
 * @date 2020/5/7 14:58
 */
/*
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。
 * 提供必要的构造器和抽象方法：work()。对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
 * 请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Mananger yxy = new Mananger( "yxy", 222,111,333);
        yxy.work();
    }
}
abstract class Employee{
    private String name;
    private int id;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Mananger extends Employee{
    private int bonus;
    @Override
    public void work() {
        System.out.println(getId()+getName()+getSalary()+bonus);
    }

    public Mananger(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
