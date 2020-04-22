package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/21 16:04
 */
public class SortTest {
    public static void main(String[] args) {
        int[] arr = {12, 30, -5, 6, 9, 10, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}