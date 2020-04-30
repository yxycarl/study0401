package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/29 10:31
 */
public class ArraysUtils {
    //求最大值
    public int maxValue(int[]number){
        int max=number[0];
        for (int i = 1; i < number.length; i++) {
            if (max<number[i]){
                max=number[i];
            }
        }
        return max;
    }
    //求最小值
    public int minValue(int[]number){
        int min=number[0];
        for (int i = 1; i < number.length; i++) {
            if (min>number[i]){
                min=number[i];
            }
        }
        return min;
    }
    //求和
    public int sum(int[]number){
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        return sum;
    }
    //求平均值
    public int avg(int [] number){
        return this.sum(number)/number.length;
    }
    //线性查找
    public int findValue(int[]number,int findNum){
        int flag=-1;
        for (int i = 0; i < number.length; i++) {
            if (findNum==number[i]){
                flag=i;
                break;
            }
        }
        return flag;
    }
    //复制
    public int[]copyNumbers (int [] num){
        int[] copyNumbers = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            copyNumbers[i]=num[i];
        }
        return copyNumbers;
    }
    //反转
    public void reverse(int []number){
        for (int i = 0; i < number.length/2; i++) {
            int temp=number[i];
            number[i]=number[number.length-i-1];
            number[number.length-i-1]=temp;
        }
    }
    //排序
    public void sort(int[]number,String str){
        if ("asc".equals(str)){
            for (int i = 0; i < number.length-1; i++) {
                for (int j = 0; j < number.length-i-1; j++) {
                    if (number[j]>number[j+1]){
                        int temp=number[j];
                        number[j]=number[j+1];
                        number[j+1]=temp;
                    }
                }
            }
        }else if("desc".equals(str)){
            for (int i = 0; i < number.length-1; i++) {
                for (int j = 0; j < number.length-i-1; j++) {
                    if (number[j]<number[j+1]){
                        int temp=number[j];
                        number[j]=number[j+1];
                        number[j+1]=temp;
                    }
                }
            }
        }else {
            System.out.println("输入错误");
        }

    }
}
