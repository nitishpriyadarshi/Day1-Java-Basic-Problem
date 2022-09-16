package com.bridgelab;
import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (// TODO Auto-generated method stub
             Scanner sc = new Scanner(System.in)) {
            System.out.println("Check Leap Year, Century Year or Not");
            System.out.println("-------------------------------------");
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            if (year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Year '"+year+"' is a Century Year and a Leap Year!");
                } else {
                    System.out.println("Year '"+year+"' is a Century Year but not a Leap Year!");
                }
            } else {
                if(year % 4 == 0){
                    System.out.println("Year '"+year+"' is a Leap Year!");
                } else {
                    System.out.println("Year '"+year+"' is not a Leap Year!");
                }
            }
        }

    }

}
