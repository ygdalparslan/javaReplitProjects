package com.ForWhile;

/*
Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6
Output: 6!=6*5*4*3*2*1=720
 */

import java.util.Scanner;

public class ForWhile04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tama sayı giriniz");
        double sayi = scan.nextDouble();


        if (sayi % 1 == 0) {

            if (sayi >= 0) {
                int faktoriyel = 1;
                System.out.print((int) sayi + "!= ");

                while (sayi > 0) {
                    faktoriyel *= sayi;
                    if (sayi == 1) {
                        System.out.print((int) sayi);
                    } else {
                        System.out.print((int) sayi + "*");
                    }
                    sayi--;
                }
                System.out.println("= " + faktoriyel);


            } else {
                System.out.println("Negatif sayıların faktoriyeli hesaplanamaz");
            }

        } else {
            System.out.println("Girdiğiniz sayı tamsayı olmalıdır. Ondalıklı değil.");
        }


    }
}
