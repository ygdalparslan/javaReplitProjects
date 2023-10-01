package com.ConditionalStatements;
/*
Kullanıcıdan bir harf girmesini isteyiniz.
Girilen harf sesli ise Sesli harf olduğunu,
değilse sessiz harf olduğunu ekrana yazdırsın.
Girdiği değer harf değilse yada 1 karakterden fazla ise
hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

Sesli harfler: a,e,i,o,u

Test Data:

a

Beklenen Çıktı:

a harfi sesli harfdir.

Test Data:

d

Beklenen Çıktı:

d harfi sesiz harftir.

Test Data:

we  yada %

Beklenen Çıktı:

Yanlis karakter girdiniz!

 */

import java.util.Scanner;

public class ConditionalStatement11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");

        String harf = scanner.next();

        if (harf.length()>1 || harf.matches("[^a-zA-Z]")) {
            System.out.println("Yanlis karakter girdiniz!");
        } else if (harf.matches("[aeiouAEIOU]")) {
            System.out.println(harf+" harfi sesli harfdir.");
        } else if (harf.matches("[^aeiouAEIOU]")) {
            System.out.println(harf+" harfi sessiz harfdir.");
        }


    }
}
