package com.itheima.branch;

public class MethodTest4 {
    public static void main(String[] args) {

        int rs = add(5);
        System.out.println("一到五的和" + rs);


        int rs2 = add(5);
        System.out.println("一到一百的和" + rs2);
    }
    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
}
