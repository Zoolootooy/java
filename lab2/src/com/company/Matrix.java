package com.company;
import java.util.Scanner;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        float  data[][];
        Random rnd = new Random(System.currentTimeMillis());
        Scanner in = new Scanner(System.in);

        System.out.print("Размерность матрицы: ");
        int n = in.nextInt();
        data = new float[n][n];
        float tmp;


        float insert = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                insert++;
                data[i][j] = insert;
            }
        }

        System.out.println("\nМатрица:\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("\t" + data[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            for (int  j = 0; j < i; j++){
                tmp = data[i][j];
                data[i][j] = data[j][i];
                data[j][i] = tmp;
            }
        }


        System.out.println("\nМатрица после транспонирования:\n");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("\t" + data[i][j] + " ");
            }
            System.out.println();
        }


    }
}
