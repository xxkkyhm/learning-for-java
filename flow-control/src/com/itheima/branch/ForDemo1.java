package com.itheima.branch;

public class ForDemo1 {
    public static void main(String[] args) {
        for (int i = 3; i < 5; i++){
        System.out.println(22);
        }

        for (int i =1; i<=100;i++){
            System.out.println(i);
        }


        int sum = 0;
        for (int i = 1;i<=100; i++){
            sum = sum +i;
        }
        System.out.println("1~5的数据和="+sum);


        int sum1 = 0;

        for (int i = 1; i<100; i+=2){
            sum1 += i;
        }
        System.out.println("1~100之间的奇数和：" + sum1);
    }
}
