package com.itheima.branch;

public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println("aaa");
            i++;
        }

        System.out.println("====================================");


        double peakHeight = 8848860;
        double paperThickness = 0.1;

        int count = 0;

        while (paperThickness < peakHeight){
            paperThickness = paperThickness * 2;
            count++;

        }
        System.out.println("zhedie" + count);
        System.out.println("houdu" + paperThickness);
    }

}
