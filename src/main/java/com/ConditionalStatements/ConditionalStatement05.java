package com.ConditionalStatements;

import java.util.Scanner;

/*
1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.

Test Data:
2
2016
Beklenen çıktı:
2016 yili Subat ayi 29 gun
Test Data:
4
1998
Beklenen Çıktı:
1998 yili Nisan ayi 30 gun
 */

public class ConditionalStatement05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();

        switch (month){
            case 1:
                System.out.println(year +" yili Ocak ayi 30 gun");
                break;
            case 3:
                System.out.println(year +" yili Mart ayi 30 gun");
                break;
            case 5:
                System.out.println(year +" yili Mayıs ayi 30 gun");
                break;
            case 7:
                System.out.println(year +" yili Temmuz ayi 30 gun");
                break;
            case 8:
                System.out.println(year +" yili Ağustos ayi 30 gun");
                break;
            case 10:
                System.out.println(year +" yili Ekim ayi 30 gun");
                break;
            case 12:
                System.out.println(year +" yili Aralık ayi 30 gun");
                break;
            case 4:
                System.out.println(year +" yili Nisan ayi 30 gun");
                break;
            case 6:
                System.out.println(year +" yili Haziran ayi 30 gun");
                break;
            case 11:
                System.out.println(year +" yili Kasım ayi 30 gun");
                break;
            case 2:
                if (year%4==0){
                    System.out.println(year +" yili Şubat ayi 29 gun");
                }else {
                    System.out.println(year +" yili Şubat ayi 28 gun");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
                break;
        }


    }

}
