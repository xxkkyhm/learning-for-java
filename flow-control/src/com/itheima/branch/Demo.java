package com.itheima.branch;

public class Demo {
    public static void main(String[] args) {
        int[] faceScores = {15,9000,10000,20000,9500,-5};
//                            0   1    2      3    4    5
        int max =faceScores[0];

        for (int i = 0; i < faceScores.length; i++) {

            if (faceScores[i] > max){
                max = faceScores[i];

            }
        }

        System.out.println("最高颜值：" + max);

    }
}
