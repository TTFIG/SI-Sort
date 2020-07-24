package cn.itcyt.java.thread;

public class ThreadTest extends Thread{

    @Override
    public void run(){
        try{
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程被选中了");
        }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        test.start();
        ThreadTest test1 = new ThreadTest();
        test1.start();
        ThreadTest test2 = new ThreadTest();
        test2.start();
    }
}
