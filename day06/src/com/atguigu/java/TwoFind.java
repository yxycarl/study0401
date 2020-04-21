package com.atguigu.java;


import java.util.Arrays;

/**
 * @author yxycarl
 * @date 2020/4/21 15:34
 */
public class TwoFind {
    public static void main(String[] args) {
        int[] numbers={ 12, 30, -5, 6, 9, 10, 5 };
        int[] num=new int[numbers.length];
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            num[i]=numbers[i];
            System.out.print(num[i]+" ");
        }
        System.out.println();
        int findnumber=10;
        int index=-1;
        int start=0;
        int end=num.length;
        for (int i = 0; i < num.length; i++) {
            int mid=(start+end)/2;
            if (findnumber==num[i]){
                index=i;
                break;
            }else if (findnumber>mid){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if (index==-1){
            System.out.println("meiyou找到");
        }else {
            System.out.println(index+"找到了");
        }

    }
}
