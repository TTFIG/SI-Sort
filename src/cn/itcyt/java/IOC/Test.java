package cn.itcyt.java.IOC;

public class Test {
    private Shiyanlou shiyanlou;

    public void setShiyanlou(Shiyanlou shi) {
        System.out.println("set");
        this.shiyanlou = shi;
    }

    public String getA(String s) {
        System.out.println("getA()====>toup-> " + shiyanlou.toUp(s));
        return s;
    }
}

