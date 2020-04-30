package com.atguigu.exer;

/**
 * @author yxycarl
 * @date 2020/4/28 21:52
 */
/*
（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 */
public class Circle {
    private double radius;

    public double findArea(){
       return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
