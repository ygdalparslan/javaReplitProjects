package com.Scanner;

import java.util.Scanner;

/*
    Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

    Ornek Cikti :
    Alan: 9
    Cevre: 12

  */
public class Scanner02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karenin kenar uzunluğunu giriniz");
        int kenarUzunlugu = scan.nextInt();

        int alan = kenarUzunlugu*kenarUzunlugu;
        int cevre = kenarUzunlugu*4;

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }
}
