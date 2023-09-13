package com.If_Switch_Ternary_StringMethods;

/*
  Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
  INPUT:
  Ay Numarasi:
  2
  Yil :
  2016
  OUTPUT  :
  Subat 2016 29 Gundur.
  */


import java.util.Scanner;

public class If_Switch_Ternary_StringMethods05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay numarası giriniz.");
        int ayNo = scan.nextInt();
        switch (ayNo){
            case 1:
                System.out.println("Ocak 2016 31 Gundur.");
                break;
            case 2:
                System.out.println("Subat 2016 29 Gundur.");
                break;
            case 3:
                System.out.println("Mart 2016 31 Gundur.");
                break;
            case 4:
                System.out.println("Nisan 2016 30 Gundur.");
                break;
            case 5:
                System.out.println("Mayıs 2016 31 Gundur.");
                break;
            case 6:
                System.out.println("Haziran 2016 30 Gundur.");
                break;
            case 7:
                System.out.println("Temmuz 2016 31 Gundur.");
                break;
            case 8:
                System.out.println("Ağustos 2016 31 Gundur.");
                break;
            case 9:
                System.out.println("Eylül 2016 30 Gundur.");
                break;
            case 10:
                System.out.println("Ekim 2016 31 Gundur.");
                break;
            case 11:
                System.out.println("Kasım 2016 30 Gundur.");
                break;
            case 12:
                System.out.println("Aralık 2016 31 Gundur.");
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz");
        }
    }
}
