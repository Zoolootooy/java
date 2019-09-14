package com.company;

public class Ferma {
    public static void work(int n){
        long a,b,c;
        for(int i=1;i<=100;i++){
            for (int j=1;j<=100;j++){
                for (int k=1;k<=100;k++){


                        a=(long)Math.pow(i,n);
                        b=(long)Math.pow(j,n);
                        c=(long)Math.pow(k,n);
                        if (a+b==c){
                            System.out.println(i+"^"+n+ "+"+ j+"^"+n+  "=" +k+"^"+n  );
                        }

                }
            }
        }
    }
    public static void main(String[] args) {

        for (int n=3; n < 10; n++){
            work(n);
        }

        work(2);
    }
}
