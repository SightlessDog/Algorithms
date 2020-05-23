package com.company;

public class Mainn {
    public static void main(String[] args) {
        long sum = 0;
        long n = 4;
        // Fragment 1
        //for ( int i = 0; i < n; i ++)
          // sum++;

        //Fragment 2
        //for ( long i = 0; i < n; i ++){
          //  for ( long j = 0; j < n; j ++){
            //    sum++;
            //}
        //}

        // Fragment 3
        //for ( int i = 0; i < n; i ++) {
          //  for ( int j = i; j < n; j ++) {
            //    sum++;
           // }
        //}

        //Fragment 4
        //for ( int i = 0; i < n; i ++)
          //  sum ++;
       // for ( int j = 0; j < n; j ++)
         //   sum ++;

        //Fragment 5
        //for ( int i = 0; i < n; i ++) {
          //  for ( int j = 0; j < n*n; j ++) {
            //    sum++;
            //}
        //}

        //Fragment 6
        //for ( int i = 0; i < n; i ++)  {
          //  for ( int j = 0; j < i; j ++) {
            //    sum++;
           // }
        //}

        //Fragment 7
        for ( int i = 1; i < n; i ++)
            for ( int j = 0; j < n*n; j ++)
                if (j % i == 0)
                    for (int k = 0; k < j; k++)
                        sum++;

        System.out.println(sum);


    }
}
