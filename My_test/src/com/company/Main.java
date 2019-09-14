package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        int dif = Integer.parseInt(args[0]) - Integer.parseInt(args[1]);
        int mul = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
        int quo = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);

        System.out.println("Sum = " + sum) ;
        System.out.println("Dif = " + dif) ;
        System.out.println("Mul = " + mul) ;
        System.out.println("Quo = " + quo) ;
    }
}
