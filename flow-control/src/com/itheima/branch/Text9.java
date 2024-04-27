package com.itheima.branch;

import java.util.Random;
import java.util.Scanner;

public class Text9 {
    public static void main(String[] args) {

        int[] userNumbers = userSelectNumber();
        System.out.println("投注的号码");
        printArray(userNumbers);

        int[] luckNmumbers = creatLuckNumbers();
        System.out.println("中奖的号码");
        printArray(luckNmumbers);

        judge(userNumbers,luckNmumbers);
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

    public static int[] creatLuckNumbers(){
        int[] numbers = new int[7];

        Random r = new Random();

        for (int i = 0; i < numbers.length - 1; i++) {

            while (true){
                int number = r.nextInt(33) + 1;

                if (!exist(numbers,number)){
                    numbers[i] = number;
                    break;
                }
            }
        }
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }

    private static void judge(int[] userNumbers,int[] luckNumbers){
        int redCount = 0;
        int blueCount = 0;

        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < luckNumbers.length; j++) {
                if (userNumbers[i] == luckNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }
        blueCount = userNumbers[6] == luckNumbers[6] ? 1 : 0;

        System.out.println("您命中的红球数量：" + redCount);
        System.out.println("您命中的蓝球数量：" + blueCount);

        if (redCount == 6 && blueCount == 1){
            System.out.println("中奖1000万");
        }else if (redCount == 6 && blueCount == 1){
            System.out.println("中奖500万");
        }else if (redCount == 5 && blueCount == 1){
            System.out.println("中奖3000");
        }else if (redCount == 5 && blueCount == 0 || redCount == 4 && blueCount == 1){
            System.out.println("中奖200");
        }else if (redCount == 4 && blueCount == 0 || redCount == 3 && blueCount == 1){
            System.out.println("中奖10");
        }else if (redCount < 3 && blueCount == 1){
            System.out.println("中奖5");
        }else {
            System.out.println("无中奖");
        }
    }
}
