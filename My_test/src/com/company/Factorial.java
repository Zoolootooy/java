package com.company;

public class Factorial {

    public static void main(String[] args) {

        long F = 1;
        for (int i = 2; i <= Integer.parseInt(args[0]); i++){
            F *= i;
        }
        System.out.println("!" + args[0] + " = " + F) ;
    }
}
