package com.atguigu.java;

import jdk.nashorn.internal.ir.CaseNode;
import jdk.nashorn.internal.ir.Flags;

/**
 * @author yxycarl
 * @date 2020/4/20 14:50
 */
public class FamilyAccount {
    public static void main(String[] args) {
        String details = "收支\t账户金额\t收支金额\t说    明\n";
        int balance = 10000;
        boolean flag=true;
        do {
            System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                   请选择(1-4)：");
            char key = Utility.readMenuSelection();
            switch (key){
                case '1':
                    System.out.println(details);
                    break;
                case '2':
                    System.out.print("收入金额：");
                    int i = Utility.readNumber();
                    System.out.print("说明：");
                    String s = Utility.readString();
                    balance +=i;
                    details +="\n收入\t"+balance+"\t"+i+"\t"+s+"\n";
                    break;

                case '3':
                    System.out.print("支出金额：");
                    int a = Utility.readNumber();
                    System.out.print("说明：");
                    String b = Utility.readString();
                    balance -=a;
                    details +="\n支出\t"+balance+"\t"+a+"\t"+b+"\n";
                    break;
                case '4':
                    flag=false;
                    break;
            }


        }while (flag);
    }
}
