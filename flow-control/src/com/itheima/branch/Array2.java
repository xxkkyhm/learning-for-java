package com.itheima.branch;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = {12,24,36};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 66;
        arr[2] = 100;


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

//        元素个数
        System.out.println(arr.length);

        System.out.println(arr.length - 1);
    }
}
