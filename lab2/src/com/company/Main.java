package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    float  data[][] = new float[2][3];


	    for (int i = 0; i < 2; i++){
	    	for (int j = 0; j < 3; j++){
	    		data[i][j] = (float) (i+j);
			}
		}

		System.out.print("Вектор а: {");
	    for (int i = 0; i < 3; i++){
	        System.out.print(data[0][i] + "; ");
        }
		System.out.print("\b\b}\n");


		System.out.print("Вектор в: {");
	    for (int i = 0; i < 3; i++){
	        System.out.print(data[1][i] + "; ");
        }
		System.out.println("\b\b}\n");

		float Scalar = 0;
		for (int i = 0; i < 3; i++){
			Scalar += data[0][i]*data[1][i];
		}
		System.out.println("Скалярное произведение: " + Scalar);

		System.out.print("Векторное произведение: ");
		System.out.print("{" + (data[0][1]*data[1][2] - data[0][2]*data[1][1]) + "; ");
		System.out.print((data[0][0]*data[1][2] - data[0][2]*data[1][0])*(-1) + "; ");
		System.out.print((data[0][0]*data[1][1] - data[0][1]*data[1][0]) + "}");
    }
}
