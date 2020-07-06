package cn.itcyt.java.IOC;

public class ShiyanlouImpl implements Shiyanlou {
    @Override
    public String toUp(String name){
        try {
            return name.toUpperCase();
        } catch (Exception e) {
            return null;
        }
    }
}
