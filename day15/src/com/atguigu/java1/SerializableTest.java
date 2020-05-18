package com.atguigu.java1;

import java.io.*;

/**
 * @author yxycarl
 * @date 2020/5/18 11:50
 */
public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化   把Java对象转换为字节序列的过程；将对象写入到磁盘文件中
        FileOutputStream fos = new FileOutputStream("day15\\aaa.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student student1 = new Student("lihao", "wjwlh", "21");
        oos.writeObject(student1);
        oos.flush();
        //反序列化  指把字节序列恢复为Java对象的过程。
        FileInputStream fis = new FileInputStream("day15\\aaa.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student2 = (Student) ois.readObject();
        System.out.println(student2.getUserName()+ " " +
                student2.getPassword() + " " + student2.getYear());
    }
}
class Student implements Serializable {

    private static final long serialVersionUID = -6060343040263809614L;

    private String userName;
    private String password;
    private String year;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Student(String userName, String password, String year) {
        this.userName = userName;
        this.password = password;
        this.year = year;
    }
}

