package com.itheima.branch;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        double[] scores = new double[6];

        Scanner sc =new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {

            System.out.println("输入当前第" + ( i + 1) + "个评委的分数");
            double score = sc.nextDouble();
            scores[i] = score;
        }

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        System.out.println("选手最终得分：" + sum / scores.length);


    }
}
