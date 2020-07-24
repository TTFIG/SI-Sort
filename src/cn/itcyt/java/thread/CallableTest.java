package cn.itcyt.java.thread;

import java.util.concurrent.*;

public class CallableTest implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        System.out.println("创建成功");
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest callable = new CallableTest();

        //创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(1);
        //提交执行
        Future<Boolean> result = service.submit(callable);

        boolean isTrue = result.get();
        service.shutdownNow();

    }

}

