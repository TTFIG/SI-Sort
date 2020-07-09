package cn.itcyt.java;

public class PrimesDemo {

    public static void main(String[] args) {
        long sum = 2;
        PrimesDemo demo = new PrimesDemo();
        for (int i = 3; i <= 200000; i++) {
            if (demo.State(i) == true) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public boolean State(int temp) {
        for (int i = 2; i * i <= temp; i++) {
            if (temp % i != 0) {
                return true;
            }
        }
        return false;
    }
}
