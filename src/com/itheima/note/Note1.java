package com.itheima.note;

public class Note1 {
    public static void main(String[] args) {
        double size = 6.8;
//        double size = 9.8;
        int storage = 16;
        boolean rs = size >=6.95 & storage >= 8;
        System.out.println(rs);

        boolean rs2 = size >=6.95 | storage >= 8;
        System.out.println(rs2);

        System.out.println("----------------------------------------");

        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2 > 1));

        System.out.println("--------------------------------------");

        System.out.println(false ^ false);
        System.out.println(false ^ true);

        System.out.println("--------------------------------------");

        int i = 10;
        int j = 10;
//                          false        不执行
        System.out.println(i > 100 && ++j > 99);
//        System.out.println(i > 100 & ++j > 99);
        System.out.println(j);

        System.out.println("--------------------------------------");

        int m = 10;
        int n = 30;
//                          true       不执行
        System.out.println(m > 3 || ++n > 40);
//        System.out.println(m > 3 | ++n > 40);
        System.out.println(n);

    }
}
