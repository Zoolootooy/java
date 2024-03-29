package com.company;
import java.util.Arrays;
import java.util.Random;

public class Hoar {
    public static void quickSort(int[] array, int low, int high) {


        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);


    }

    static final int MIN = 1;
    static final int MAX = 100;

    static void WriteArray(int[] A){
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100000000;


        int x[] = new int[n];


        for (int i = 0; i < n; i++){
            x[i] = (int)MIN+rand.nextInt(MAX-MIN + 1);
        }


        //System.out.println("Было: ");
        //WriteArray(x);

        int low = 0;
        int high = x.length - 1;

        //____________________________
        long t1,t2;
        t1=System.currentTimeMillis();

        quickSort(x, low, high);

        t2=System.currentTimeMillis();
        //____________________________

        System.out.println("Быстрая сортировка Хоара заняла: " + (t2-t1) + "ms");

        //System.out.println("Стало: ");
        //WriteArray(x);

    }
}
