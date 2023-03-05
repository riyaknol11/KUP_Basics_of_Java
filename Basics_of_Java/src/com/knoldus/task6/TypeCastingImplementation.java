package com.knoldus.task6;

public class TypeCastingImplementation {
    public static void main(String[] args) {
        //Explicit conversion of double to int
        double distance = 5;
        System.out.println("Result before type casting : " + distance);
        int result = (int) distance;
        System.out.println("Result after type casting is : " + result);
    }
}
