package com.Scanner;

import java.util.Scanner;

/*
    Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
    */
public class Scanner01 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir sayı giriniz");

            int num = scan.nextInt();

            double result = Math.pow(num,3)/2;

            System.out.println("result = " + result);

        }


}
