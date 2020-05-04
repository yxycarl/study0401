package com.atguigu.exer;

/**
 * @author yxycarl
 * @date 2020/5/4 10:58
 */
public class InstanceofTest {
    public static void main(String[] args) {
        InstanceofTest it = new InstanceofTest();
        //(1)根据e的类型调用相应类的getInfo()方法。
        it.methord(new Person());
        System.out.println("__________________________");
        it.methord(new Student());
        System.out.println("__________________________");
        it.methord(new Graduate());
       /* (2)  根据e的类型执行：
        如果e为Person类的对象，输出：“a person”;
        如果e为Student类的对象，输出
			“a student”
			“a person ”
        如果e为Graduate类的对象，输出：
			“a graduated student”
			“a student”
			“a person”*/
        System.out.println("__________________________");
        it.methord2(new Person());
        System.out.println("__________________________");
        it.methord2(new Student());
        System.out.println("__________________________");
        it.methord2(new Graduate());

    }
    public void methord(Person p){
        System.out.println(p.getInfo());
    }
    public void methord2(Person p){
        if(p instanceof Graduate){
            System.out.println("a graduated student");
            System.out.println("a person");
            System.out.println("a student");
        }else if(p instanceof Student){
            System.out.println("a person");
            System.out.println("a student");
        } else if(p instanceof Person){
            System.out.println("a person");
        }
    }
}
class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
    }
}