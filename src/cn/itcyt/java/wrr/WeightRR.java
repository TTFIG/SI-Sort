package cn.itcyt.java.wrr;

public class WeightRR {

    //求权值的最大和
    public int getSum(int set[],int size){
        int i= 0;
        int res = 0;

        for (i = 0; i < size; i++) {
            res += set[i];
        }
        return res;
    }
    //求公约数
    public int gcd(int a,int b){
        int c;
        while(b != 0){
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
    //获取公约数
    public int getGcd(int set[],int size){
        int i = 0;
        int res = set[0];

        for (i = 1; i < size; i++)
            res = gcd(res, set[i]);
        return res;
    }
    //获取最大数
    public int getMax(int set[],int size){
        int i = 0;
        int res = set[0];

        for (i = 1; i < size; i++)
        {
            if (res < set[i]) res = set[i];
        }

        return res;

    }
}
