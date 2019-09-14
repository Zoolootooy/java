package com.company;



public class Strings {
    static String Method(String S1, String s2,String s3,String s4, String s5){
        String s1 = S1;
        if (s4 == s5){
            S1 = S1.concat(s2);
        }
        else {
            S1 = S1.concat(s3);
        }
        return S1;
    }

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";
        String s5 = "5";

        s1 = Method(s1,s2,s3,s4,s5);

        System.out.println(s1);
    }
}
