package com.company;





public class MathDemo {
    public static void main(String[] args) {
       /* System.out.println("Примеры вызова функций:");
// Вычисление экспоненты:
        System.out.println("exp(1)="+MyMath.Exp(1,30));
// Вычисление синуса:
        System.out.println("sin(pi)="+MyMath.Sin(Math.PI,100));
// Вычисление косинуса:
        System.out.println("cos(pi/2)="+MyMath.Cos(Math.PI/2,100));
// Вычисление функции Бесселя:
        System.out.println("J0(mu1)="+MyMath.BesselJ(2.404825558,100));
// Заполнение массивов коэффициентов рядов Фурье для функции y(x)=x:
        int m=1000;
        double[] a=new double[m];
        double[] b=new double[m+1];
        b[0]=MyMath.L/2;
        for(int i=1;i<=m;i++){
            a[i-1]=(2*(i%2)-1)*2*MyMath.L/Math.PI/i;
            b[i]=-4*(i%2)*MyMath.L/Math.pow(Math.PI*i,2);}
// Вычисление функции y(x)=x через синус-ряд Фурье:
        System.out.println("2.0->"+MyMath.FourSin(2.0,a));
// Вычисление функции y(x)=x через косинус-ряд Фурье:
        System.out.println("2.0->"+MyMath.FourCos(2.0,b));*/

        double n = 15.5;
        System.out.print("Модуль " + n + " = " + MyMath.absolute(n) + "\n");
        n = -16.6;
        System.out.print("Модуль " + n + " = " + MyMath.absolute(n) + "\n");


        System.out.print(4 + "^" + 0.5 + " = " + MyMath.pow(4, 0.5)+"\n");

        System.out.print("При а = " + 3 + ", b = " + 4 + ", ∠A = " + 90 + "° c = " + MyMath.cosTeorem(3, 4,Math.toRadians(45)));
        System.out.print("\nПри а = " + 3 + ", b = " + 4 + ", c = " + 5 + ", cos∠C = " + MyMath.cosFromTriangle(3,4,5));
    }
}