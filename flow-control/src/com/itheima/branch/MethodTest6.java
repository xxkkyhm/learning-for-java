package com.itheima.branch;

public class MethodTest6 {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        printArray(arr);

        int[] arr2 = null;
        printArray(arr2);

        int[] arr3 = {};
        printArray(arr3);
    }
    public static void printArray(int[] arr){

        if (arr == null) {
            System.out.println(arr);
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ",");
//            }
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
    }
}
