package com.Arrays;
/*
Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]

 */

public class Array08 {

    public static void main(String[] args) {

        int[] arr = {1232,2345,5467,678,3454,2312,3451};

        int max1 =arr[0];
        int max2 =arr[0];
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>max1){
                max1=arr[i];
            } else if (arr[i]<max1 &&arr[i]>max2) {
                max2=arr[i];
            }

        }

        System.out.println("Array listesindeki 2. en büyük sayı= " + max2);
    }
}
