package com.atguigu.exer2;

/**
 * @author yxycarl
 * @date 2020/5/4 11:38
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[]ps=new Person[5];
        ps[0] = new Chinese("张三", 30, "男", "牛");
        ps[1] = new American("Jack", 25, "male", true);
        ps[2] = new Person("某人", 15, "未知");
        ps[3] = new American("Rose", 32, "female", false);
        ps[4] = new Chinese("李四", 40, "女", "羊");
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i].say());
            ps[i].sayHello();
        }
        System.out.println("----------------------------------");
        //对age进行冒泡排序
        for (int i = 0; i < ps.length-1; i++) {
            for (int j=0;j<ps.length-i-1;j++){
                if (ps[j].getAge()>ps[j+1].getAge()){
                    Person per=ps[j];
                    ps[j]=ps[j+1];
                    ps[j+1]=per;
                }
            }
        }
        //对排序后的进行输出
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i].say());
        }
    }
}

class Person{
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String say() {
        return "姓名:" + name + ",年龄:" + age + ",性别:" + gender;
    }

    public void sayHello() {
        System.out.println("打个招呼");
    }
}

class Chinese extends Person{
    private String shuxiang;

    public void spring() {
        System.out.println("过大年");
    }

    public Chinese(String name, int age, String gender, String shuxiang) {
        super(name, age, gender);
        this.shuxiang = shuxiang;
    }

    public String getShuxiang() {
        return shuxiang;
    }

    public void setShuxiang(String shuxiang) {
        this.shuxiang = shuxiang;
    }

    @Override
    public String say() {
        return super.say()+"\t"+shuxiang;
    }

    @Override
    public void sayHello() {
        System.out.println("chinese sayHello");
    }
}
class American extends Person{
    private boolean hasGun;
    public void christmas() {
        System.out.println("Merry Christmas!!");
    }

    public American(String name, int age, String gender, boolean hasGun) {
        super(name, age, gender);
        this.hasGun = hasGun;
    }

    public boolean isHasGun() {
        return hasGun;
    }

    public void setHasGun(boolean hasGun) {
        this.hasGun = hasGun;
    }

    @Override
    public String say() {
        return super.say()+"\t"+hasGun;
    }

    @Override
    public void sayHello() {
        System.out.println("American Sayhelolo");
    }
}

