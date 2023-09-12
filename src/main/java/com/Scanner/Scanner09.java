package com.Scanner;

import java.util.Scanner;

public class Scanner09 {

/*
Girilen zamanı saniyeye çeviren bir program yazınız.

  Örnek Çıktı:
  1 saat 10 dakika 50 saniye ==>
  4250 saniye
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen saati giriniz");

        int saat = scan.nextInt();
        System.out.println("Lütfen dakikayı giriniz");
        int dakika = scan.nextInt();
        System.out.println("Lütfen saniyeyi giriniz");
        int saniye = scan.nextInt();

        int toplamSaniye = saniye+(dakika*60)+(saat*60*60);
        System.out.println(toplamSaniye+" saniye");

    }
}
