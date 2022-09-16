package com.bridgelab;

public class SumOfCommandLine {
    public static void main(String as[]) {
        int n, cnt = 0, sum = 0;
        for(int i =0; i < as.length;i++){
            n=Integer.parseInt(as[i]);
            sum=sum=n;
            System.out.println("Invalid Integer");
            cnt++;

        }
        System.out.println("Sum of only valid Integer="+sum);
        System.out.println("Invalid Integer is "+cnt);

    }
}
