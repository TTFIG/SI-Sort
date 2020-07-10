package cn.itcyt.java;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {


        int leftLimit = 2;
        int rightLimit = 11;

        Runnable r = ()->{
            int generatedInteger = leftLimit + (int)(Math.random() * rightLimit);
            System.out.println(generatedInteger);
        };
        for (int i = 0; i < 10; i++) {
            new Thread(r).start();
        }
        Runnable runnable = ()->{
            Random random1 = new Random(11);
            Random random2 = new Random(10);
            System.out.println("random1: "+random1.nextInt(11)+"\trandom2: "+random2.nextInt(10));
        };
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
        Random ran1 = new Random(10);
        System.out.println("使用种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran1.nextInt(10) + " ");
        }
        System.out.println();
        Random ran2 = new Random(10);
        System.out.println("使用另一个种子为10的Random对象生成[0,10)内随机整数序列: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ran2.nextInt(10) + " ");
        }
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.print(random.nextInt(10)+"\t次数为："+count+"\n");
        }

//        ArrayList<?> arrayList = new ArrayList();
//        RandomDemo randomDemo = new RandomDemo();
//        arrayList = randomDemo.getDiffNO(10);
//        System.out.println(arrayList);
//
//    }
//
//    //生成不重复的随机数
//    public ArrayList getDiffNO(int n){
//        ArrayList list = new ArrayList();
//        Random rand = new Random();
//        boolean[] bool = new boolean[n];
//        int num = 0;
//        for (int i = 0; i < n; i++) {
//            do {
//                // 如果产生的数相同继续循环
//                num = rand.nextInt(n);
//            } while (bool[num]);
//            bool[num] = true;
//            list.add(num);
//        }
//        return list;
    }
}
