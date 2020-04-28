package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/27 9:53
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[20];
        for (int i = 0; i < stu.length; i++) {
            stu[i]=new Student();
            stu[i].number=i+1;
            stu[i].state=(int)(Math.random()*6+1);
            stu[i].score=(int)Math.round(Math.random()*100);
        }
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].state==3){
                System.out.println(stu[i].number+" "+stu[i].state+" "+stu[i].score+"");
            }
        }
    }
}
class Student {
    int number;int state;int score;
}
/*定义类Student，包含三个属性：学号number(int)，年级state(int)，
 * 成绩score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定，
 * 打印出3年级(state值为3）的学生信息。 */
