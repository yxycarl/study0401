package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/28 11:36
 */
public class Girl {
    String naem ;
    int age;
    public void marry(Boy boy){
        if (boy.getAge()<18){
            System.out.println("鸡鸡太小");
        }else if (boy.getAge()<28){
            System.out.println("我们恋爱吧");
        }else {
            System.out.println("我们结婚吧");
            boy.marry(this);
        }
    }
    public void compare(Girl girl){
        if (this.age<girl.getAge()){
            System.out.println(this.naem+"比"+girl.getNaem()+"漂亮");
        }else {
            System.out.println(girl.getNaem()+"比"+this.naem+"漂亮");
        }
    }
    public Girl(String naem, int age) {
        this.naem = naem;
        this.age = age;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
