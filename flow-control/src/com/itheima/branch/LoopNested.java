package com.itheima.branch;

public class LoopNested {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <=5; j++) {
                System.out.println("aaa" + i);
            }
            System.out.println("===========================");

        }



        for (int i = 1; i<= 3; i++){
            for (int j = 0; j <=4; j++) {
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
