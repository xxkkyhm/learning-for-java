package com.itheima.branch;

public class Array4 {
    public static void main(String[] args) {
        int [] money ={16,26,36,46,100};

        int sum = 0;

        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("员工的销售总额" + sum);
    }
}
