package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/22 11:45
 */
public class YangHuiSanJiao {
    public static void main(String[] args) {
        int[][]number=new int[10][];
        for (int i = 0; i < number.length; i++) {
            number[i]=new int[i+1];
            number[i][0]=number[i][i]=1;
            for (int j=1;j<number[i].length-1;j++){
                number[i][j]=number[i-1][j]+number[i-1][j-1];
            }
        }
        for (int i = 0; i < number.length; i++) {
            for (int i1 = 0; i1 < number[i].length; i1++) {
                System.out.print(number[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
