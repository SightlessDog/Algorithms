package com.company;

import java.util.Timer;

public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // for (long i = 1099511627679L; i < 1099511627799L ; i++) {
        //if (isPrime(i)) {
            //    System.out.println("The entered number : " + i + " is prime");
            // } else {
            //    System.out.println("Not Prime");
            // }
            //  }
        for (long i = 1048477; i < 1048597 ; i++) {
        if (isPrime(i)) {
        System.out.println("The entered number : " + i + " is prime");
         } else {
            System.out.println("Not Prime");
         }
         }
         long finish =  System.currentTimeMillis();
        System.out.println(finish-start);

    }

    public static boolean isPrime (long n) {
        boolean prime = false;
        for (var i=2 ; i<n-1 ; i++) {
            if (n%i == 0) {
                prime = false;
                break;
            } else {
                prime = true;
                break;
            }
        }
        return prime;
    }
}
