package com.interview.demo4;


public class RecurrenceDemo {

    public static void main(String[] args) {
        int num = go(5);
        System.out.println("num=" + num);
    }

    private static int go(int n){
        if(n < 0){
            throw new RuntimeException("非法参数！");
        }

        if(n == 1 || n==0){
            return 1;
        }
        return go(n - 1) * n;
    }
}
