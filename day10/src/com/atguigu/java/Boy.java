package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/28 11:36
 */
public class Boy {
    String name;
    int age;

    public void marry(Girl girl){
        System.out.println(this.name+"：我愿意娶你"+girl.getNaem());
    }
    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
