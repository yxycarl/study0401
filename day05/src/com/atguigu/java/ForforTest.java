package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/16 17:32
 */
/*
		输出
							i(行)    j（#）   k(*)
			####*			1		 4			1
			###* *			2		 3			2
			##* * *			3		 2			3
			#* * * *		4		 1			4
			* * * * *		5		 0			5
		*/
public class ForforTest {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print("#");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
