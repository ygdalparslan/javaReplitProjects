package com.Scanner;

import java.util.Scanner;

public class Scanner06 {


/*
  Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
  Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
  Ornek Cikti:
  Sayilarin Ortalamasi : 30

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ortalamasını istediğiniz sayıları giriniz.");


        int num1 = scan.nextInt(); // 22;
        int num2 = scan.nextInt(); // 20;
        int num3 = scan.nextInt(); // 30;
        int num4 = scan.nextInt(); // 28;
        int num5 = scan.nextInt(); // 50;
        System.out.println("Sayilarin Ortalamasi : "+(num1+num2+num3+num4+num5)/5);


    }
}
