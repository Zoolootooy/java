package com.company;
import java.util.Random;

public class Factorial1 {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(11);
        long F=1;

        for (int i = 2; i <= n; i++){
            F *= i;
        }
        System.out.println("!" + n + " = " + F) ;
    }
}
