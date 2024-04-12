package com.itheima.branch;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {

        int num = 0;
        int num2 = 0;
        int book = 12;
        int qianbi = 1;
        int xiangpi = 2;
        int kele = 3;
        int lingshi = 5;

        System.out.println("书本的价格为" + book + "元，您总共有20元");
        System.out.println("1.铅笔的价格为：" + qianbi + "元");
        System.out.println("2.橡皮的价格为：" + xiangpi + "元");
        System.out.println("3.可乐的价格为：" + kele + "元");
        System.out.println("4.零食的价格为：" + lingshi + "元");


        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入其他需要购买商品的序列号：");
        int xvhao = sc1.nextInt();
        if (xvhao == 1) {
            num = 8/qianbi;
            num2 = 8 % qianbi;
            System.out.println("购买完书本后还可以购买铅笔" +  num + "个,还剩" + num2 + "元");
        } else if (xvhao == 2) {
            num = 8/xiangpi;
            num2 = 8 % xiangpi;
            System.out.println("购买完书本后还可以购买橡皮" +  num + "个,还剩" + num2 + "元");
        } else if (xvhao == 3) {
            num = 8/kele;
            num2 = 8 % kele;
            System.out.println("购买完书本后还可以购买可乐" +  num + "个,还剩" + num2 + "元");
        } else if (xvhao == 4) {
            num = 8/lingshi;
            num2 = 8 % lingshi;
            System.out.println("购买完书本后还可以购买零食" +  num + "个,还剩" + num2 + "元");
        }else {
            System.out.println("您输入的代码不正确");
        }

    }
}
