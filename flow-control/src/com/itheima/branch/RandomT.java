package com.itheima.branch;

import java.util.Random;
import java.util.Scanner;

public class RandomT {
    public static void main(String[] args) {

        Random r = new Random();
        int luckNum = r.nextInt(100) + 1;


        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("shuru:");
            int guessnum = sc.nextInt();

            if (guessnum >luckNum){
                System.out.println("guoda");
            }else if (guessnum < luckNum){
                System.out.println("guoxiao");
            }else {
                System.out.println("cjenggong");
                break;
            }
        }
    }
}
