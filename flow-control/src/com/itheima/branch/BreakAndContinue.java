package com.itheima.branch;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            System.out.println("aaa" + i);
            if (i == 3){
                break;
            }

            System.out.println("===============");

            for (int j = 0; j <= 5; j++) {
                if (j == 3){
                    continue;
                }
                System.out.println("bbb" + j);

            }
        }
    }
}
