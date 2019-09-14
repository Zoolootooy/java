package com.company;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long [] F;

        if (n <= 0){
            System.out.print("Массив не может быть такого размера\n");
        }
        else {
            F = new long[n];

            if (n<3 && n>0){
                for (int i = 0; i < n; i++){
                    F[i] = i;
                }
            }

            if(n>2){
                F[0] = 0;
                F[1] = 1;
                for (int i = 2; i < n; i++){
                    F[i] = F[i-1] + F[i-2];
                }
            }

            System.out.print("Массив с числами Фибоначчи:\t\n");
            for (int i = 0; i < n; i++){
                System.out.print(F[i] + " ");
            }
        }
    }
}