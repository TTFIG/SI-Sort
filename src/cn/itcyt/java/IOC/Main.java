package cn.itcyt.java.IOC;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Shiyanlou shi = new ShiyanlouImpl();
        ioc("Test", shi,"getA", "xuxu");
        }

    public static void ioc(String className, Shiyanlou s, String methodName, String name){
        try {
            java.lang.Class<?> clazz = Class.forName(className);
            Field field[] = clazz.getDeclaredFields();
            Object obj = clazz.newInstance();
            for (int i = 0; i < field.length; i++) {
                if (Shiyanlou.class.isAssignableFrom(field[i].getType())) {
                    String setName = "set" + field[i].getName().substring(0, 1).toUpperCase() + field[i].getName().substring(1);
                    Method method1 = clazz.getMethod(setName, Shiyanlou.class);
                    method1.invoke(obj, s);
                }
            }
            Method method = clazz.getMethod(methodName, String.class);
            method.invoke(obj, name);
        } catch (Exception e) {
        }
    }
}
