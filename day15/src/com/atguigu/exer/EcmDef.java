package com.atguigu.exer;

import org.junit.Test;

/**
 * @author yxycarl
 * @date 2020/5/8 22:48
 */
/*编写应用程序EcmDef.java，接收命令行的两个参数，计算两数相除。
        对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException、
        除0(ArithmeticException) 进行异常处理。
        提示：
        (1)在主类(EcmDef)中定义异常方法(ecm)完成两数相除功能。
        (2)在main()方法中使用异常处理语句进行异常处理。

        (3)运行时接受参数 java EcmDef 20 10
        //args[0]=“20” args[1]=“10”
        (4)Interger类的static方法parseInt(String s)将s转换成对应的int值。如int a=Integer.parseInt(“314”);	//a=314;*/

public class EcmDef {
    public static void main(String[] args) {

        try {
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            EcmDef ecmDef = new EcmDef();
            ecmDef.ecm(num1,num2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
    public void ecm(int num1,int num2) throws ArithmeticException{
        System.out.println(num1 / num2);
    }
    @Test
    public void a(){
        System.out.println("yxy");
    }
}
