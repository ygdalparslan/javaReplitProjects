package com.ConditionalStatements;

/*
Ugly Number:

Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
Sayı sisteminde,
ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.
Test Data:
13
Beklenen çıktı:
ugly number  degildir
Test Data:
25
Beklenen Çıktı:
ugly number
*/

import java.util.Scanner;

public class ConditionalStatement12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int num =scanner.nextInt();

        if (num > 0) {
            if (num==1 || num%2==0 || num%3==0 || num%5==0) {
                System.out.println("ugly number");
            }else {
                System.out.println("ugly number  degildir");
            }

        }else {
            System.out.println("0 ya da negatif sayılar dahil değildir.");
        }




    }

}
