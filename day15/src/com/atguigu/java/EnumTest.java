package com.atguigu.java;

/**
 * @author yxycarl
 * @date 2020/5/8 21:47
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.getSEASONDES() + "\t" + Season.SPRING.getSEASONNAME());
    }
}
class Season{
    private final String SEASONNAME;
    private final String SEASONDES;

    private Season(String SEASONNAME, String SEASONDES) {
        this.SEASONNAME = SEASONNAME;
        this.SEASONDES = SEASONDES;
    }

    public static final Season SPRING = new Season("春天","春眠不觉晓");
    public static final Season SUMMER = new Season("夏天","处处蚊子咬");
    public static final Season AUTUMN = new Season("秋天","秋天天气凉");
    public static final Season WINTER = new Season("冬天","冬天穿棉袄");

    public String getSEASONNAME() {
        return SEASONNAME;
    }

    public String getSEASONDES() {
        return SEASONDES;
    }
}
