package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/5/7 11:51
 */
public class TemplateMethod {
    public static void main(String[] args) {
//        Computer subComputer = new SubComputer();
//        subComputer.runTime();
        System.out.println(" --------------------");
        Computer c=new Computer() {
            @Override
            public void runCode() {
                for (int i = 0; i <10000 ; i++) {
                    if (i%2==0){
                        System.out.println(i);
                    }
                }
            }
        };
        c.runTime();
    }

}
abstract class Computer{
    public void runTime(){
        double start=System.currentTimeMillis();
        runCode();
        double end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    public abstract void runCode();
}
class SubComputer extends Computer{

    @Override
    public void runCode() {
        for (int i = 0; i <10000 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

