package com.ForWhile;

/*
Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

Input  :1238
Output :Girilen Numananin Tersi: 8321

 */

import java.util.Scanner;

public class ForWhile09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");
        int sayi = scan.nextInt();
        int tersi = 0;

        while (sayi != 0) {

            int sonRakam = sayi % 10;
            tersi = tersi * 10 + sonRakam;
            sayi /= 10;

        }

        System.out.print("Girilen Numananin Tersi: "+tersi);
    }
}
