package com.company;
import java.util.Random;

public class Arrays {
    static int[] sortChoose(int[] A){
        int [] B = A;
        long t1,t2;
        int minIndex;
        int temp;
        t1=System.currentTimeMillis();

        for (int i = 0; i < B.length; i++){
           minIndex = i;

            for (int j = i+1; j < B.length; j++){
                if (A[j] < A[minIndex]){
                    minIndex = j;
                }
            }

            temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;

        }
        t2=System.currentTimeMillis();
        System.out.println("Сортировка выбором заняла: " + (t2-t1) + "ms");
        return B;
    }

    static int[] sortCount(int[] A){
        int [] B = new int[A.length];
        long t1,t2;

        t1=System.currentTimeMillis();
        int count[] = new int[B.length];

        for (int i = 0; i < count.length; i++){
            count[i] = 0;
        }

        for (int i = A.length-1; i > 0; i--){
            for (int j = i-1; j >= 0; j--){
                if (A[i] < A[j]){
                    count[j]++;
                }
                else {
                    count[i]++;
                }
            }
        }

        int Index;
        int temp;

        for (int i = 0; i < B.length; i++){
            B[count[i]] = A[i];
        }
        t2=System.currentTimeMillis();

        System.out.println("Сортировка подсчётом заняла: " + (t2-t1) + "ms");
        return B;
    }

    static int[] sortBouble(int[] A){
        int [] B = A;
        long t1,t2;

        t1=System.currentTimeMillis();
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < B.length-1; i++) {
                if(B[i] > B[i+1]){
                    isSorted = false;

                    buf = B[i];
                    B[i] = B[i+1];
                    B[i+1] = buf;
                }
            }
        }
        t2=System.currentTimeMillis();


        System.out.println("Сортировка пузырьком заняла: " + (t2-t1) + "ms");
        return B;
    }


    static int[] sortGnumme(int[] A){
        int [] B = A;
        long t1,t2;

        t1=System.currentTimeMillis();
        int i = 1, j = 2, temp;
        while (i < B.length) {
            if (B[i-1] < B[i]){
                i = j;
                j++;
            }
            else {
                temp = B[i-1];
                B[i-1] = B[i];
                B[i] = temp;

                i--;
                if (i == 0){
                    i = j;
                    j++;
                }
            }
        }
        t2=System.currentTimeMillis();

        System.out.println("Гномья сортировка заняла: " + (t2-t1) + "ms");
        return  B;
    }

    static void WriteArray(int[] A){
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    static final int MIN = 1;
    static final int MAX = 100;

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100;
        int A[] = new int[n];

        System.out.print("Массив размером " + n + " элементов.\n");

        for (int i = 0; i < n; i++){
            A[i] = (int)MIN+rand.nextInt(MAX-MIN + 1);
        }

        int B[] = new int[n];
        int C[] = new int[n];
        int D[] = new int[n];
        for (int i = 0; i < n; i++){
           B[i] = A[i];
           C[i] = A[i];
           D[i] = A[i];
        }

        A = sortChoose(A);
        B = sortCount(B);
        C = sortBouble(C);
        D = sortGnumme(D);
    }
}
