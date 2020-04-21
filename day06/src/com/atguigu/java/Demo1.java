package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/4/20 22:48
 */
public class Demo1 {
    public static void main(String[] args) {
        char[] cs = new char[36];
        char ch = 'A';
//注意：一定不要写成int值。因为 unicode值0 对应的不一定是 '0'
        char ch2 = '0';
        for (int i = 0; i < cs.length; i++) {
            if (i <= 25) { //将 'A' - 'Z'放入到数组中
                cs[i] = ch;
                ch = (char) (ch + 1);
            } else { //将'0' - '9'放入到数组中
                cs[i] = ch2;
                ch2 = (char) (ch2 + 1);
            }
            System.out.print(cs[i]);
        }
    }
}
/*
 练习二
         创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,   后10个元素放置'0'-'9‘。
         使用for循环访问所有元素并打印出来。
*/
