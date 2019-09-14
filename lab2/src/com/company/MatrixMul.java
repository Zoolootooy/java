package com.company;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;



public class MatrixMul {
    static final double MIN = 0;
    static final double MAX = 20;
    static final int Precise = 2;

    static double roundTo (double d, int precise) {


        d *= Math.pow(10, precise);
        d = Math.round(d);
        d /= Math.pow(10, precise);
        return (double)d;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        double C[][], A[][], B[][];
        System.out.print("Размерность матриц: ");
        int n = in.nextInt();

        C = new double[n][n];
        A = new double[n][n];
        B = new double[n][n];

        double d;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                d = MIN + (MAX - MIN)*rand.nextDouble();
                A[i][j] = roundTo(d, Precise);
                d = MIN + (MAX - MIN)*rand.nextDouble();
                B[i][j] = roundTo(d, Precise);
            }
        }

        System.out.println("\nМатрица A:\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("\t" + A[i][j] + " ");
            }
            System.out.println();

    }

        System.out.println("\nМатрица B:\n");
        for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++){
            System.out.print("\t" + B[i][j] + " ");
        }
        System.out.println();
    }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                C[i][j] = 0;
                for(int k = 0; k < n; k++)
                    C[i][j] += A[i][k]*B[k][j];
                C[i][j] = roundTo(C[i][j], Precise*Precise);
            }
        }

        System.out.println("\nМатрица C:\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("\t" + C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
