package com.itheima.branch;

public class Array5 {
    public static void main(String[] args) {

        int[] ages = new int[3];

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        ages[0] = 12;
        ages[1] = 18;
        ages[2] = 32;


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println("====================");

        char[ ] chars = new char[3];
        System.out.println((int)chars[0]);
        System.out.println((int)chars[2]);

        double[] scores = new double[80];
        System.out.println(scores[0]);
        System.out.println(scores[79]);

        boolean[] flags = new boolean[100];
        System.out.println(flags[0]);
        System.out.println(flags[99]);

        String[] names = new String[80];
        System.out.println(names[0]);
        System.out.println(names[79]);
    }
}
