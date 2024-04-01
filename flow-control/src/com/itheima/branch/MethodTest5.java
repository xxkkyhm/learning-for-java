package com.itheima.branch;

public class MethodTest5 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);

        System.out.println("==============");

        int[] arrs = new int[]{10,20,30};
        change2(arrs);
        System.out.println(arrs[1]);
    }

    public static void change(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }

    public static void change2(int[] arrs){
        System.out.println(arrs[1]);
        arrs[1] = 222;
        System.out.println(arrs[1]);
    }
}
