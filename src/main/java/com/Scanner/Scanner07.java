package com.Scanner;

import java.util.Scanner;

public class Scanner07 {

/*
  Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
  */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Double bir sayı giriniz.");
        double dbl = scan.nextDouble();
        int sayi = (int) dbl;
        System.out.println(sayi);


    }
}
