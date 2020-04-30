package com.atguigu.java;

import java.util.Arrays;

/**
 * @author yxycarl
 * @date 2020/4/29 11:07
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 15, -9, 13 };
        ArraysUtils au = new ArraysUtils();
        System.out.println(au.maxValue(numbers));
        System.out.println(au.minValue(numbers));
        System.out.println(au.sum(numbers));
        System.out.println(au.avg(numbers));
        Arrays.toString(au.copyNumbers(numbers));
        System.out.println(au.findValue(numbers, 15));
        au.reverse(numbers);
        System.out.println(Arrays.toString(numbers));
        au.sort(numbers,"asc");
        System.out.println(Arrays.toString(numbers));


    }
}
