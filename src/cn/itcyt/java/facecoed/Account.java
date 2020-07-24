package cn.itcyt.java.facecoed;

public class Account {
    int i;
    long l;
    short s;
    double d;
    float f;
    boolean b;
    byte bt;
    char c;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public byte getBt() {
        return bt;
    }

    public void setBt(byte bt) {
        this.bt = bt;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Account{" +
                "i=" + i +
                ", l=" + l +
                ", s=" + s +
                ", d=" + d +
                ", f=" + f +
                ", b=" + b +
                ", bt=" + bt +
                ", c=" + c +
                '}';
    }
}
