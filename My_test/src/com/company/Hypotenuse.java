package com.company;



public class Hypotenuse {
    public static void main(String[] args) {
        double C,A,B;
        A = Double.parseDouble(args[0]);
        B = Double.parseDouble(args[1]);

        System.out.println("A = " + A + "\nB = " + B);
        System.out.println("C = " + Math.sqrt(A*A+B*B) + "\n");
    }
}
