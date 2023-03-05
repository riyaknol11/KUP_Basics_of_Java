package com.knoldus.task8;

public class CircleOperations {
    public static void main(String[] args) {
        double radius = 3;
        double circumference, area;
        //Calculating the Area of circle
        area = 3.14 * radius * radius;
        //Calculating the circumference of circle
        circumference = 2 * 3.14 * radius;
        System.out.println("Area of the circle is : " + area);
        System.out.println("Circumference of the circle is : " + circumference);
    }
}
