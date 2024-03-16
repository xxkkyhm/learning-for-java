package com.itheima.branch;

public class ifDemo1 {
    public static void main(String[] args) {
        double t = 38.9;
        if (t > 37){
            System.out.println("这个人的温度异常，把他赶紧带走~~");
        }


//        double m = 99;
        double m = 19;
        if (m >= 90){
            System.out.println("发红包成功了");
        }else {
            System.out.println("余额不足");
        }


        int s = 78;
        if (s >= 0 &&  s < 60){
            System.out.println("您的绩效级别是：D");
        }else if (s >= 60 && s <80){
            System.out.println("您的绩效级别是：c" );
        }else if (s >= 80 && s <90){
            System.out.println("您的绩效级别是：b");
        }else if (s >= 90 && s <100){
            System.out.println("您的绩效级别是：a");
        }else {
            System.out.println("您录入的分数有毛病");
        }

    }
}
