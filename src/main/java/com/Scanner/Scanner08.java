package com.Scanner;

import java.util.Scanner;

public class Scanner08 {

    /*
  Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

   Örnek Çıktı:
   Verilen tamsayının rakamları toplamı 10'dur.
  */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 3 basamklı bir sayı giriniz..");
        int sayi = scan.nextInt();
        int birlerBasamagı=sayi%10;
        int onlarBasamagı=(sayi/10%10);
        int yuzlerBasamagı=sayi/100;
        int basamakToplami = birlerBasamagı+onlarBasamagı+yuzlerBasamagı;

        System.out.println("Verilen tamsayinin rakamlari toplami "+basamakToplami+"'dur.");

    }
}
