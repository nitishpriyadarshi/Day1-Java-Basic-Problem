package com.bridgelab;

import java.util.Scanner;

public class StringsEqualOrNot {
    public static void main(String[] args) {

        String s1, s2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The First String : ");
            s1 = sc.nextLine();

            System.out.println("Enter The Second String : ");
            s2 = sc.nextLine();
        }

        if(s1.equals(s2))
            System.out.println("Equals");
        else
            System.out.println("Not Equals");

    }


}
