package cn.itcyt.java;

public class ToCharArray {
    public static void main(String[] args) {
        String s = new String("欧拉计划") ;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("---------------");
        String c = new String(chars,0,4);
        System.out.println(c);
    }
}
