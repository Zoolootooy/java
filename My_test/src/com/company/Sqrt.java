package com.company;

public class Sqrt {
    static void sqrt(double a){
        double b=a;
        int i=0;
        while ((b*b>a)&&(i<200)){
            b=(b+a/b)/2;
            i++;
        }
        System.out.println("Sqrt(" + a + ") = " +b);
    }

    public static void main(String[] args) {
        sqrt(Double.parseDouble(args[0]));
    }
}
