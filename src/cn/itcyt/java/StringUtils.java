package cn.itcyt.java;

public class StringUtils {

    public static void main(String[] args) {
        System.out.println(allIsNotNull(null));
        System.out.println(allIsNotEmpyty("7"));
    }

        public static boolean allIsNotNull(String...s) {
            if (s == null || s.length == 0) { // 容易忽略的地方
                return false;
            }
            for (int i = 0; i < s.length; i++) {
                if (s[i] == null) {
                    return false;
                }
            }
            return true;
        }

        public static boolean allIsNotEmpyty(String...s) {
            if (s == null || s.length == 0) { // 容易忽略的地方
                return false;
            }
            for (int i = 0; i < s.length; i++) {
                if (s[i] == null || s[i].equals("")) {
                    return false;
                }
            }
            return true;
        }
}
