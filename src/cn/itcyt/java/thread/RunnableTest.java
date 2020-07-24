package cn.itcyt.java.thread;

public class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("实现了runnable的接口");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();

        Thread thread = new Thread(new RunnableTest());
        thread.start();
    }
}
