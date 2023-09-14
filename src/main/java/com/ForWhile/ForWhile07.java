package com.ForWhile;

import java.util.Scanner;

/*
Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.

Input :6
Output:
6 Mukemmel Sayidir.
======================
Input 7
Output:
7 Mukemmel Sayidir degildir.

 */
public class ForWhile07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        int kontrol=0;

        for (int i = 1; i <=sayi/2 ; i++) {
            if (sayi%i==0){
                kontrol+=i;
            }
        }
        if (sayi==kontrol){
            System.out.println(sayi+ " Mukemmel Sayidir.");
        }else {
            System.out.println(sayi+ " Mukemmel Sayi degildir.");
        }
    }
}
