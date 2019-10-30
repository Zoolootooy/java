package com.company;

public class Task2 {
    public static void main (String[] args){
        int[] A = new int[5];

        for (int i = 0; i < A.length; i++){
            A[i] = i;
        }

        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(-15);


        List list1 = new List();
        list1.add(4);
        list1.add(5);
        list1.add(-15);


        //list.remove(0);
        //list.print();
        list.removeForKey(list1);
        System.out.println("_______________");
        list.print();
    }
}
