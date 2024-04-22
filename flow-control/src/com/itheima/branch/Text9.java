package com.itheima.branch;

import java.util.Scanner;

public class Text9 {
    public static void main(String[] args) {

        int[] userNumbers = userSelectNumber();
        printArray(userNumbers);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
    }

    public static int[] userSelectNumber(){
        int[] numbers = new int[7];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请您输入第" + (i + 1) + "个红球号码（1~33之间，不能重复）");
                int number = sc.nextInt();

                if (number < 1 || number >33){
                    System.out.println("对不起，您输入的红球号码不在1~33之间，请重新输入");
                }else {
                    if (exist(numbers,number)){
                        System.out.println("对不起，您选择的红球号码前面选择过了，请重新选择");
                    }else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请您输入蓝球号码(1~16)");
            int number = sc.nextInt();
            if (number < 1 || number > 16 ){
                System.out.println("对不起，您输入的号码不对");
            }else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }

    private static boolean  exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                break;
            }
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }
}
