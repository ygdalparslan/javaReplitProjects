package com.Scanner;

import java.util.Scanner;

public class Scanner07 {

/*
Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

int a= 3;
int b= 5;
Ornek Cikti:
a=5
b=3

*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Değerlerini değiştirmek istediğiniz 2 sayı giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
