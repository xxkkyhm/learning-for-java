package com.itheima.note;

public class NoteDemo1 {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 520;
        a += b;
        System.out.println(a);

        double c =600;
        double d = 520;
        c -= d;
        System.out.println(c);

        double q =600;
        double w = 520;
        q *= w;
        System.out.println(q);

        double m =600;
        double n = 520;
        m /= n;
        System.out.println(m);

        byte x = 10;
        byte y = 30;
//        x= x + y;
        x = (byte)(x + y);
        System.out.println(x);

    }
}
