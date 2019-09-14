package com.company;

public class MyMath {
    // Класс с математическими функциями:
// Интервал разложения в ряд Фурье:
    static double L=Math.PI;
    // Экспонента:
    static double Exp(double x,int N){
        int i;
        double s=0,q=1;
        for(i=0;i<N;i++){
            s+=q;
            q*=x/(i+1);
        }
        return s+q;
    }
    // Синус:
    static double Sin(double x,int N){
        int i;
        double s=0,q=x;
        for(i=0;i<N;i++){
            s+=q;
            q*=(-1)*x*x/(2*i+2)/(2*i+3);
        }
        return s+q;
    }
    // Косинус:
    static double Cos(double x,int N){
        int i;
        double s=0,q=1;
        for(i=0;i<N;i++){
            s+=q;
            q*=(-1)*x*x/(2*i+1)/(2*i+2);
        }
        return s+q;
    }
    // Функция Бесселя:
    static double BesselJ(double x,int N){
        int i;
        double s=0,q=1;
        for(i=0;i<N;i++){
            s+=q;
            q*=(-1)*x*x/4/(i+1)/(i+1);
        }
        return s+q;
    }
    // Ряд Фурье по синусам:
    static double FourSin(double x,double[] a){
        int i,N=a.length;
        double s=0;
        for(i=0;i<N;i++){
            s+=a[i]*Math.sin(Math.PI*x*(i+1)/L);
        }
        return s;}
    // Ряд Фурье по косинусам:
    static double FourCos(double x,double[] a){
        int i,N=a.length;
        double s=0;
        for(i=0;i<N;i++){
            s+=a[i]*Math.cos(Math.PI*x*i/L);
        }
        return s;
    }

    //округление d до указанного кол-ва знаков после запятой presize
    static double roundTo (double d, int precise) {
        d *= Math.pow(10, precise);
        d = Math.round(d);
        d /= Math.pow(10, precise);
        return (double)d;
    }

    static float roundTo (float d, int precise) {
        d *= Math.pow(10, precise);
        d = Math.round(d);
        d /= Math.pow(10, precise);
        return (float) d;
    }

    //Модуль числа
    static int absolute(int A){
        if (A < 0){
            A *= -1;
        }
        return A;
    }

    static double absolute(double A){
        if (A < 0){
            A *= -1;
        }
        return A;
    }

    static float absolute(float A){
        if (A < 0){
            A *= -1;
        }
        return A;
    }

    static long absolute(long A){
        if (A < 0){
            A *= -1;
        }
        return A;
    }

    //Возведение в степень
    static double pow(int base, int indicator){
        double Res = 1;
        for (int i = 0; i < absolute(indicator); i++){
            Res *= base;
        }
        if (indicator < 0){
            Res = 1/(Res);
        }
        return Res;
    }

    static double pow(int base, double indicator){
        double Res = 1;

        double P = indicator*Math.log(base);
        Res = Math.exp(P);

        return Res;
    }

    static double pow(double base, double indicator){
        double Res = 1;

        double P = indicator*Math.log(base);
        Res = Math.exp(P);

        return Res;
    }

    //теорема косинусов для стороны и угла
    static double cosTeorem(double a, double b, double A){
        double c = pow((a*a + b*b - 2*a*b*Math.cos(A)), 0.5);
        return c;
    }

    static double cosFromTriangle(double a, double b, double c){
        double A = (a*a+b*b-c*c)/2*a*b;
        return A;
    }

}