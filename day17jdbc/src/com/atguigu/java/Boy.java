package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/5/21 21:35
 */
public class Boy {
    private int id;
    private String boyname;
    private String usercp;

    public Boy() {
    }

    public Boy(int id, String boyname, String usercp) {
        this.id = id;
        this.boyname = boyname;
        this.usercp = usercp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoyname() {
        return boyname;
    }

    public void setBoyname(String boyname) {
        this.boyname = boyname;
    }

    public String getUsercp() {
        return usercp;
    }

    public void setUsercp(String usercp) {
        this.usercp = usercp;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "id=" + id +
                ", boyname='" + boyname + '\'' +
                ", usercp='" + usercp + '\'' +
                '}';
    }
}
