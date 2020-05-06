package com.atguigu.exer1;

import java.util.Objects;

/**
 * @author yxycarl
 * @date 2020/5/5 14:23
 */
public class Circle extends GemObject {
    private double radius;

    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle() {
        super("white",1.0);
        radius=1.0;
    }

    public Circle(double radius) {
        super("white",1.0);
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
