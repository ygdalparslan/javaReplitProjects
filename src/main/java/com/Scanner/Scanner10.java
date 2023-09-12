package com.Scanner;

import java.util.Scanner;

public class Scanner10 {
    /*
 Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

 INPUT:
 Dakika sayısı: 3456789
 OUTPUT :
 3456789 dakika yaklaşık 6 yıl 210 gündür
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dakika giriniz");
        int dakika = scan.nextInt();

        int sene = dakika / (60 * 24 * 365);
        int gun = (dakika % (60 * 24 * 365)) / (24 * 60);

        System.out.println(dakika + " dakika yaklaşık " + sene + " yıl " + gun + " gündür");


    }


}
