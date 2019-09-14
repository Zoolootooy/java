package com.company;

public class LabRob {
    public static void main(String[] args) {
        Point lowerLeft = new Point();
        Point upperRight = new Point();
        Point middlePoint = new Point();
        lowerLeft.x = 0.0;
        lowerLeft.y = 0.0;
        upperRight.x = 1280.0;
        upperRight.y = 1024.0;
        middlePoint.x = 640.0;
        middlePoint.y = 512.0;
        /*
        System.out.println("lower left > "+lowerLeft.x+","+lowerLeft.y);
        System.out.println("upper Right > "+upperRight.x+","+upperRight.y);
        System.out.println("middle Point > "+middlePoint.x+","+middlePoint.y);
        System.out.println("origin Point > "+Point.origin.x+","+Point.origin.y);
        System.out.println("middle Point > "+middlePoint.x+","+middlePoint.y);
        middlePoint.clear();
        System.out.println("middle Point > "+middlePoint.x+","+middlePoint.y);
        */
        double d = middlePoint.distance(lowerLeft);
        System.out.println("d = "+d);
    }
}
