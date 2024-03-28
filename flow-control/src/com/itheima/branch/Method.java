package com.itheima.branch;

public class Method {
    public static void main(String[] args) {

        int rs = sum(10,20);
        System.out.println(rs);

        int a1 = 20;
        int b1 = 30;
        int c1 = a1 + b1;
        System.out.println(c1);
    }

    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
}
