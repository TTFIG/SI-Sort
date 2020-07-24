package cn.itcyt.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {
    public static void main(String[] args) {
        String str = "厦门市(思明区)(湖里区)(翔安区)";
        Pattern compile = Pattern.compile(".*?(?=\\()");
        Matcher matcher = compile.matcher(str);
        if (matcher.find()){
            System.out.println(matcher.group());
        }

        //int char byte double float long boolean short
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        System.out.println(a == b);//false
        System.out.println(a == c);//true
        System.out.println(b == c);//true

        //trans
        RegExpTest regExpTest = new RegExpTest();
        String s = "FUJIANSHENG";
        System.out.println(regExpTest.translate(s));
    }

    public String translate (String str){
        String tempStr = "";
        try{
            tempStr = new String(str.getBytes("ISO-8859-1"), "GBK");
            tempStr = tempStr.trim();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return tempStr;
    }
}
