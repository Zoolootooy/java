package com.company;

public class pow {
    public static void main(String[] args) {
        long A = 1;
        for (int i = 0; i < Integer.parseInt(args[0]); i++){
            A *= 2;
        }
        System.out.println("2^" + Integer.parseInt(args[0]) + " = " + A);
    }
}
