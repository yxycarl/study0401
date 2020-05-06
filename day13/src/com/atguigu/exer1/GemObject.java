package com.atguigu.exer1;

/**
 * @author yxycarl
 * @date 2020/5/5 14:21
 */
public class GemObject {
   protected String color;
   protected double weight;

    protected GemObject() {
    }

    protected GemObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
