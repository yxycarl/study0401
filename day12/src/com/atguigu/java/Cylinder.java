package com.atguigu.java;


/**
 * @author yxycarl
 * @date 2020/4/30 15:52
 */
public class Cylinder extends Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println(circle.findArea());
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(2);
        cylinder.setRadius(2);
        System.out.println(cylinder.findVolume());
    }
    private double length;

    public double findVolume(){
        return super.findArea()*length;
    }
    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
