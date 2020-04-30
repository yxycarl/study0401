package com.atguigu.exer;

/**
 * @author yxycarl
 * @date 2020/4/28 21:55
 */
/*
 （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
		public void printAreas(Circle c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        passObject.printAreas(new Circle(),5);
    }
    public void printAreas(Circle c, int time){
        System.out.println("半径\t面积");
        int i = 1;
        for ( ;i <= time; i++) {
            c.setRadius((double) i);
            System.out.println(c.getRadius()+"\t"+c.findArea());
        }
        System.out.println(i);
    }
}
