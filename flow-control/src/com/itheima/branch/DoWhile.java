package com.itheima.branch;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("aaa");
            i++;
        }while (i < 3);

        System.out.println("==================");

        do {
            System.out.println("aaa");
        }while (false);


        System.out.println("=================================");

        for (int j = 0; j < 3;j++){
            System.out.println("aaa");
        }
//        System.out.println(j);

        int m = 0;
        while (m < 3){
            System.out.println("aaa");
            m++;
        }
        System.out.println(m);
    }
}
