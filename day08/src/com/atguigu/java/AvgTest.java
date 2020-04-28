package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/23 11:38
 */
public class AvgTest {
    public static void main(String[] args) {
        VarArg va = new VarArg();
        System.out.println(va.avg(2)); // 一个参数可以
//      分母可能为0，报错java.lang.ArithmeticException: / by zero
//        System.out.println(va.avg()); // 不传参数也可以
//        System.out.println(va.avg(null)); // 传null也可以
        System.out.println(va.avg(10, 20, 40, 50)); // 任意多个也可以
        System.out.println(va.avg(10, 20, 40, 50,70, 80, 100, 5, 2, 3));
        int[] arr = new int[]{2, 3, 4, 5};
        System.out.println(va.avg(arr)); // 直接传数组也可以
        System.out.println(va.avg(new int[]{10, 20})); // 编译器会自动做这件事,也可以手工创建数组
    }
}
class VarArg{
    // 可变参数, 参数的个数可以是任意个, 只能放在参数列表的最后
    public int avg(int... values) { // int...是数组, 同时又能兼容任意个数参数
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}
