package cn.itcyt.java.IntegerExt;

import java.util.HashMap;
import java.util.Map;

public class IntegerExt {

    private int i;
    private static Map<String, IntegerExt> list = new HashMap<>(256);

    private IntegerExt(int i){
        this.i = i;
    }

    public int toIntValue(){
        return i;
    }

    public static IntegerExt getInstance(int i){
        String str = String.valueOf(i);
        if (list.containsKey(str)) {
            return list.get(str);
        }
        IntegerExt result = new IntegerExt(i);
        if (i >= -128 && i <= 127) {
            list.put(str, result);
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IntegerExt) {
            return this.i == ((IntegerExt)obj).toIntValue();
        }
        return super.equals(obj);
    }
}
