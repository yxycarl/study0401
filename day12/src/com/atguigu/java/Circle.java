package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/30 15:49
 */
public class Circle {
    private double radius;

    public double findArea(){
        return Math.PI*radius*radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
