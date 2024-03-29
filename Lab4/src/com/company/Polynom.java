package com.company;

import java.util.Scanner;

public class Polynom {
    // Полином степени n-1:
    private int n;
    // Коэффициенты полинома:
    private double[] a;

    void set(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите степень полинома:");
        n = s.nextInt();
        n++;

        a = new  double[this.n];

        for (int i = 0; i < n; i++){
            System.out.println("Введите коэффициент степени " + i);
            a[i] = s.nextDouble();
        }
    }
    // Определение коэффициентов полинома на основе массива:
    void set(double[] a){
        this.n=a.length;
        this.a=new double[n];
        int i;
        for(i=0;i<n;i++)
            this.a[i]=a[i];
    }
    // Определение коэффициентов полинома
// (аргументы - размер массива и число для заполнения):
    void set(int n, double z){
        this.n=n;
        this.a=new double[n];
        int i;
        for(i=0;i<n;i++)
            this.a[i]=z;
    }
    // Определение коэффициентов полинома
// (аргумент - размер массива, массив заполняется нулями):
    void set(int n){
        set(n, 0);}
    // Вычисление значения полинома в точке:
    double value(double x){
        double z=0,q=1;
        for(int i=0;i<n;i++){
            z+=a[i]*q;
            q*=x;}
        return z;
    }
    // Отображение коэффициентов полинома:
    void show(){int i;
        System.out.print("Степень x:\t");
        for(i=0;i<n-1;i++){ System.out.print(" "+i+"\t");}
        System.out.println(" "+(n-1));
        System.out.print("Коэффициент:\t");
        for(i=0;i<n-1;i++){ System.out.print(a[i]+"\t");}
        System.out.println(a[n-1]);
    }
    // Отображение значения полинома в точке:
    void show(double x){
        System.out.println("Значение аргумента x="+x);
        System.out.println("Значение полинома P(x)="+value(x));
    }
    // Производная от полинома:
    Polynom dif(){
        Polynom t=new Polynom(n-1);
        for(int i=0;i<n-1;i++)
            t.a[i]=a[i+1]*(i+1);
        return t;
    }
    // Производная от полинома порядка k:
    Polynom dif(int k){
        if(k>=n) return new Polynom(1);
        if(k>0) return dif().dif(k-1);
        else return new Polynom(a);
    }
    // Сумма полиномов:
    Polynom plus(Polynom Q){
        Polynom t;
        int i;
        if(n>=Q.n){
            t=new Polynom(a);
            for(i=0;i<Q.n;i++)
                t.a[i]+=Q.a[i];
        }
        else{
            t=new Polynom(Q.a);
            for(i=0;i<n;i++)
                t.a[i]+=a[i];
        }
        return t;
    }
    // Разность полиномов:
    Polynom minus(Polynom Q){
        return plus(Q.prod(-1));
    }
    Polynom div(double z){
        return prod(1/z);
    }
    // Произведение полинома на число:
    Polynom prod(double z){
        Polynom t=new Polynom(a);
        for(int i=0; i<n; i++)
            a[i]*=z;
        return t;
    }
    // Произведение полинома на полином:
    Polynom prod(Polynom Q){
        int N=n+Q.n-1;
        Polynom t=new Polynom(N);
        for(int i=0;i<n;i++){
            for(int j=0;j<Q.n;j++){
                t.a[i+j]+=a[i]*Q.a[j];
            }
        }
        return t;
    }
    // Конструкторы класса:
    Polynom(double[] a){
        set(a);
    }
    Polynom(int n,double z){
        set(n,z);
    }
    Polynom(int n){
        set(n);}

    Polynom(){

    }
}