package com.itheima.branch;

public class Switch3 {
    public static void main(String[] args) {

        String week = "周六";
        switch (week) {
            case "周一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "周二":
                System.out.println("请求大牛程序员帮忙");
                break;

            case "周三":
                System.out.println("请求大牛程序员帮忙");
                break;

            case "周四":
                System.out.println("今晚啤酒，龙虾，小烧烤");
                break;

            case "周五":
                System.out.println("求大牛程序员帮忙");
                break;

            case "周六":
            case "周七":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("您输入的星期日期不对");
        }
    }
}
