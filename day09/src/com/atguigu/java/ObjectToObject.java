package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/27 10:09
 */
public class ObjectToObject {
    public static void main(String[] args) {
        People people = new People();
        people.name="yxy";
        people.age=26;
        Animal animal = new Animal();
        animal.age=2;
        animal.name="哈士奇";
        people.animal=animal;
        System.out.println(people.animal.age+people.animal.name);

    }
}
class People{
    String name;
    int age;
    Animal animal;
}
class Animal{
    String name;
    int age;
}

