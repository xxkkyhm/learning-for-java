package com.itheima.branch;

import java.util.Random;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        int[] moneys = {9,666,150,234,424};
        start(moneys);

    }
    public static void start(int[] moneys){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (int i = 1; i < 5; i++) {
            System.out.println("请输入任意内容进行抽奖：");
            sc.next();

            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];

                if (money != 0 ){
                    System.out.println("抽中了红包：" + money);
                    moneys[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束");
    }
}
