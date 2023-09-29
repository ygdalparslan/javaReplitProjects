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
public class ConditionalStatement05_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin (1 ile 12 arasında): ");
        int ay = scanner.nextInt();

        System.out.print("Bir yıl girin: ");
        int yil = scanner.nextInt();

        int gunSayisi = 0;

        switch (ay) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                gunSayisi = 31;
                break;
            case 4: case 6: case 9: case 11:
                gunSayisi = 30;
                break;
            case 2:
                if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            default:
                System.out.println("Hatalı bir ay girdiniz!");
                break;
        }

        String ayAdi = "";

        switch (ay) {
            case 1: ayAdi = "Ocak"; break;
            case 2: ayAdi = "Subat"; break;
            case 3: ayAdi = "Mart"; break;
            case 4: ayAdi = "Nisan"; break;
            case 5: ayAdi = "Mayis"; break;
            case 6: ayAdi = "Haziran"; break;
            case 7: ayAdi = "Temmuz"; break;
            case 8: ayAdi = "Agustos"; break;
            case 9: ayAdi = "Eylul"; break;
            case 10: ayAdi = "Ekim"; break;
            case 11: ayAdi = "Kasim"; break;
            case 12: ayAdi = "Aralik"; break;
        }

        System.out.println(yil + " yili " + ayAdi + " ayi " + gunSayisi + " gun");

    }
}
