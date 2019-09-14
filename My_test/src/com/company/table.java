package com.company;

public class table {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.print((1 + (int) (Math.random() * 9)) + " ");
            }
            System.out.println();
        }
    }
}
