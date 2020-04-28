package com.atguigu.java;

import com.sun.media.sound.SoftTuning;

import java.util.Scanner;

/**
 * @author yxycarl
 * @date 2020/4/27 10:34
 */
/*
1. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
成绩>=最高分-10    等级为’A’
成绩>=最高分-20    等级为’B’
成绩>=最高分-30    等级为’C’
其余              等级为’D’
提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("先读入学生人数");
        int num = s.nextInt();
        //new 一个对象数组；stu只是数组名，之后要给数组元素new对象！！！
        Student1[] stu = new Student1[num];
        System.out.println("从键盘读入学生成绩");
        for (int i = 0; i < stu.length; i++) {
            stu[i]=new Student1();
            stu[i].score=s.nextInt();
        }
        System.out.println("找出最高分");
        int maxScore=0;
        for (int i = 0; i < stu.length; i++) {
            if (maxScore<stu[i].score){
                maxScore=stu[i].score;
            }
        }
        System.out.println("最高分："+maxScore);
        //给学生分数分级
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].score>=maxScore-10){
                stu[i].Dengji="A";
            }else if (stu[i].score>=maxScore-20){
                stu[i].Dengji="B";
            }else if (stu[i].score>=maxScore-30){
                stu[i].Dengji="C";
            }else {
                stu[i].Dengji="D";
            }
        }
        //输出学生等级
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].Dengji);
        }

    }
}
class Student1{
    String name;
    int score;
    String Dengji;
}
