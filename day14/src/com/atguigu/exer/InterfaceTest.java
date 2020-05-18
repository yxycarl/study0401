package com.atguigu.exer;

/**
 * @author yxycarl
 * @date 2020/5/7 15:58
 */
public class InterfaceTest {
    public static void main(String[] args) {
        Usb usb = new Mouse();
        usb.start();

        BlueTooth bt = new Mouse();
        bt.connect();

        if (usb instanceof Mouse) {
            System.out.println("我是一个鼠标");
            Mouse m = (Mouse) usb;
            m.click();
        }

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
class Mouse implements Usb,BlueTooth{

    public void click(){
        System.out.println("click()");
    }

    @Override
    public void start() {
        System.out.println("start()");
    }

    @Override
    public void stop() {
        System.out.println("stop()");
    }

    @Override
    public void connect() {
        System.out.println("connect()");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect()");
    }
}
