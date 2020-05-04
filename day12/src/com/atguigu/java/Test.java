package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/30 16:01
 */
/*
 * 编写一个Person类，包括属性（name、age），构造器、方法say(返回自我介绍的字符串）。
编写一个Student类，继承Person类，增加ID、Score属性，以及构造器，定义say方法。
编写Test类，分别创建Person和Student对象，调用say方法输出自我介绍。
*/
public class Test {
    public static void main(String[] args) {
        Person person = new Person("yxy",26);
        Student student = new Student("yxy",26,1408224018,525);
        System.out.println(person.say());
        System.out.println(student.say());
    }

}
class Person{
    String name;
    int age;
    public String say(){
        return name+"\t"+age;
    }
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    int id;
    int score;
    public String say(){
        return super.say()+"\t"+id+"\t"+score;
    }

    public Student() {
    }

    public Student(int id, int score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
}
