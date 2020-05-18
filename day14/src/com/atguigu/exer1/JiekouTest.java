package com.atguigu.exer1;

/**
 * @author yxycarl
 * @date 2020/5/7 16:15
 */
public class JiekouTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Ear ear = new Ear();
        computer.runBlueTooth(ear);
        Print print = new Print();
        computer.runUsb(print);
        Mouse mouse = new Mouse();
        computer.runUsb(mouse);
        computer.runBlueTooth(mouse);
        System.out.println("--------------------");
        computer.runUsb(new Usb() {
            @Override
            public void start() {
                System.out.println("111");
            }
            @Override
            public void stop() {
                System.out.println("222");
            }
        });
    }
}
interface  Usb{
    public abstract void start();
    public abstract void stop();
}
interface BlueTooth{
    void connect();
    void disconnect();
}
class Computer{
    public void runUsb(Usb usb){
        usb.start();
        System.out.println("运行中");
        usb.stop();
    }
    public void runBlueTooth(BlueTooth blueTooth){
        blueTooth.connect();
        System.out.println("运行中");
        blueTooth.disconnect();
    }
}
class Mouse implements Usb,BlueTooth{

    public void click(){
        System.out.println("click(Mouse)");
    }

    @Override
    public void start() {
        System.out.println("start(Mouse)");
    }

    @Override
    public void stop() {
        System.out.println("stop(Mouse)");
    }

    @Override
    public void connect() {
        System.out.println("connect(Mouse)");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect(Mouse)");
    }
}
class Ear implements BlueTooth{
    @Override
    public void connect() {
        System.out.println("connect(ear)");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect(ear)");
    }
}
class Print implements Usb{
    @Override
    public void start() {
        System.out.println("start(print)");
    }

    @Override
    public void stop() {
        System.out.println("stop(print) ");
    }
}