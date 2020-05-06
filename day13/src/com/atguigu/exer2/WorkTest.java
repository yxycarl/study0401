package com.atguigu.exer2;


/**
 * @author yxycarl
 * @date 2020/5/5 14:46
 */
public class WorkTest {
    public static void main(String[] args) {
        Worer worker = new Worer("aaa", new MyDate(12, 10, 2000));
        Worer worker2 = new Worer("aaa", new MyDate(12, 10, 2000));

        System.out.println(worker.equals(worker2));
    }
}
class Worer{
    private String name;
    private MyDate md;

    public Worer() {
    }

    public Worer(String name, MyDate md) {
        this.name = name;
        this.md = md;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getMd() {
        return md;
    }

    public void setMd(MyDate md) {
        this.md = md;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj instanceof Worer){
            return  this.name.equals(((Worer) obj).name)&&
                    this.md.equals(((Worer) obj).md);
        }
        return false;

    }
}
class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj instanceof MyDate){
            return this.day==((MyDate) obj).day&&
                    this.month==((MyDate) obj).month&&
                    this.year==((MyDate) obj).year;
        }
        return false;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
