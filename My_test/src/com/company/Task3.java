package com.company;

public class Task3 {


    static void swapMinMax(int A[]){
        int n = A.length;

        int posMin=0, posMax=0;

        for (int i = 0; i < n; i++){
            if (A[i] < A[posMin]){
                posMin = i;
            }

            if (A[i] > A[posMax]){
                posMax=i;
            }
        }

        int M;
        M=A[posMin];
        A[posMin] = A[posMax];
        A[posMax] = M;

    }

    static int[] sort(int B1[]){

        int B[] = B1;
        int n = B.length;


        int maxIndex;
        int M;
        for (int i = n-1; i > 0; i--){
            maxIndex = i;
            for (int j = i; j >=0; j--){
                if (B[j] > B[maxIndex]){
                    maxIndex = j;
                }
            }

            if (maxIndex != i){
                M = B[i];
                B[i] = B[maxIndex];
                B[maxIndex] = M;
            }
        }


        return B;
    }

    static void Average (int[] C1){
        int C[] = C1;
        int n = C.length;
        long Sum = 0;

        for (int i = 0; i < n; i++){
            Sum += C[i];
        }

        double out = (double)Sum / (double)n;
        //System.out.print("Sum: " + Sum + "\n");
        System.out.print("Avegare: " + out + "\n");
    }

    static void evenOddSumm(int[] D1){
        int[] D = D1;
        int n = D.length;
        long evenSum = 0;
        long oddSum = 0;

        for (int i = 0; i < n; i++){
            if (D[i] % 2 == 0){
                evenSum += D[i];
            }
            else {
                oddSum += D[i];
            }
        }
        System.out.print("Even Sum: " + evenSum + "\n");
        System.out.print("Odd Sum: " + oddSum + "\n");

    }


    public static void main(String[] args) {
        int Size = 10;

        int A[] = new int [Size];
        int B[] = new int[Size];
        int C[] = new int[Size];






        for (int i = 0; i<Size; i++){
            B[i] = 1 + (int) (Math.random() * 20);
        }

        System.out.println("Array D:");
        for (int i = 0; i < Size; i++){
            System.out.print( B[i]+ " ");
        }
        System.out.println();

        /*
        B = sort(B);

        for (int i = 0; i < Size; i++){
           System.out.print(B[i]+ " ");
        }
        System.out.print("\n");



        Average(B);
        */



        evenOddSumm(B);


    }
}
