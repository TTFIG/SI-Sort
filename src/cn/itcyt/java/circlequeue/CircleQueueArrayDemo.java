package cn.itcyt.java.circlequeue;

import java.util.Scanner;

public class CircleQueueArrayDemo {
    public static void main(String[] args) {
        //选择操作界面
        CircleQueue queue = new CircleQueue(4);
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        char key = ' ';
        while (loop){
            System.out.println("s:展示数据");
            System.out.println("a:添加数据");
            System.out.println("g:取出数据");
            System.out.println("h:首个数据");
            System.out.println("e:退出界面");
            key = scanner.next().charAt(0);
            switch(key){
                case 's':
                    try {
                        queue.showQueue();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'a':
                    try {
                        int temp = scanner.nextInt();
                        queue.addQueue(temp);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    try {
                        queue.getQueue();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        queue.headQueue();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    System.out.println("close~~~");
                    break;
                default:
                    break;
            }
        }
    }
}
class CircleQueue{
    //参数
    int[] cirCleQueue;//存放数据
    int maxSize;//队列最大容量
    int rear;//指向最后一个的后一个数据
    int front;//指向首个数据
    //构建
    CircleQueue(int MAX_SIZE){
        maxSize = MAX_SIZE;
        cirCleQueue = new int[maxSize];
    }
    //是否为空
    boolean isEmpty(){
        return rear == front;
    }
    //是否为满
    boolean isFull(){
        return (rear + 1) % maxSize == front;
    }
    //有效数据
    public int data(){
        return (rear + maxSize - front) % maxSize;
    }
    //展示
    public void showQueue(){
        if (isEmpty()){
            throw new RuntimeException("Is empty~~~");
        }
        for (int i = front; i < front + data(); i++) {
            System.out.printf("a[%d]=%d\n",i % maxSize,cirCleQueue[i % maxSize]);
        }
    }
    //添加
    public void addQueue(int value){
        if (isFull()){
            throw new RuntimeException("Is full~~~");
        }
        cirCleQueue[rear] = value;
        rear = (rear + 1) % maxSize;
    }
    //取出
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("Is empty~~~");
        }
        int demo = cirCleQueue[front];
        front = (front + 1) % maxSize;
        return demo;
    }
    //读取首个数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("Is empty~~~");
        }
        return cirCleQueue[front];
    }
}
