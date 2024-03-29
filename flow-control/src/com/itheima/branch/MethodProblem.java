package com.itheima.branch;

public class MethodProblem {
    public static void main(String[] args) {
        printHelloWorld();
        int rs = sum(10,20);
        System.out.println(rs);
        System.out.println(sum(10, 20));

    }

    public static int sum(int a,int b){
        int c = a + b ;
        return c;
    }


    public static void printHelloWorld(){
        for (int i = 0; i <= 3; i++) {
            System.out.println("aaa");
        }
    }
}
