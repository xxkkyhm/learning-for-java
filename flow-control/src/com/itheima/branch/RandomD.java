package com.itheima.branch;

import java.util.Random;

public class RandomD {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 1; i <= 20; i++) {
            int data = r.nextInt(10);
            System.out.println(data);
        }

        System.out.println("=======================");


        for (int i = 1; i <= 20;i++) {
            int data2 = r.nextInt(10) + 1;
            System.out.println(data2);

            System.out.println("=======================");

            for (int o = 1; i <= 20;i++) {
                int data3 = r.nextInt(15) + 3;
                System.out.println(data3);
            }
        }
    }
}
