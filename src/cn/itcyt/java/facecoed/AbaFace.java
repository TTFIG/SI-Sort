package cn.itcyt.java.facecoed;

import cn.itcyt.java.dao.AccountMapper;
import cn.itcyt.java.dao.impl.AccountImpl;

import java.util.*;

public class AbaFace {
    //基本数据类型
    int i;//四个字节，-2(31次方-1)~2(31次方)
    long l;//八个字节
    short s;//两个字节，-32768~32767
    double d;//八个字节
    float f;//四个字节
    boolean b;//一个或两个字节
    byte bt;//一个字节，-128~127
    char c;//两个字节
    //引用类型
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean tmp = true;
//        while (tmp == true){
//            scanner.nextLine();
//            tmp = false;
//        }
//
//        Account account = new Account();
//        ArrayList<Account> arrayList= new ArrayList<Account>();
//        account.setI(1);
//        arrayList.add(account);
//        System.out.println(arrayList);
////        arrayList.sort((Comparator<? super Account>) account);
//        AccountMapper ac = new AccountImpl();
//        ac.saveAccount();
//        AbaFace abaFace = new AbaFace();
//        Runnable runnable = () -> {
//            abaFace.StringBuffers();
//        };
//        System.out.println(runnable);

//    }
    //String类不能被继承，可以改成final类
//    public static final class String implements java.io.Serializable{
//        private static final long serialVersionUID = -46543543534l;
//
//        public void equals() {
//            int a = 1;
//            System.out.println(a == 1);
//        }
//    }
    //String,StringBuffer,StringBuild
//    public void equals() {
//        int a = 1;
//        System.out.println(a == 1);
//    }
//    public void Strings(){
//        String string = new String();
//        string.equals();
//    }
//    public void StringBuffers(){
//        StringBuffer stringBuffer = new StringBuffer("StringBuffer");
//    }

    static List<Integer> array=new ArrayList<Integer>();
    static List<Integer> linked=new LinkedList<Integer>();

    public static void main(String[] args) {

        //首先分别给两者插入10000条数据
        for(int i=0;i<10000;i++){
            array.add(i);
            linked.add(i);
        }
        //获得两者随机访问的时间
        System.out.println("array time:"+getTime(array));
        System.out.println("linked time:"+getTime(linked));
        //获得两者插入数据的时间
        System.out.println("array insert time:"+insertTime(array));
        System.out.println("linked insert time:"+insertTime(linked));

    }
    public static long getTime(List<Integer> list){
        long time=System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            int index = Collections.binarySearch(list, list.get(i));
            if(index != i){
                System.out.println("ERROR!");
            }
        }
        return System.currentTimeMillis()-time;
    }

    //插入数据
    public static long insertTime(List<Integer> list){
        /*
         * 插入的数据量和插入的位置是决定两者性能的主要方面，
         * 我们可以通过修改这两个数据，来测试两者的性能
         */
        long num = 10000; //表示要插入的数据量
        int index = 1000; //表示从哪个位置插入
        long time=System.currentTimeMillis();
        for(int i = 1; i < num; i++){
            list.add(index, i);
        }
        return System.currentTimeMillis()-time;

    }
}
