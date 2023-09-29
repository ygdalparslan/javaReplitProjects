package com.ConditionalStatements;

import java.util.Scanner;

public class ConditionalStatement05_2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int ay = getValidInput(scanner, "Bir sayı girin (1 ile 12 arasında): ", 1, 12);
        int yil = getValidInput(scanner, "Bir yıl girin: ", 0, Integer.MAX_VALUE);

        int gunSayisi = getDayCount(ay, yil);

        if (gunSayisi != -1) {
            String ayAdi = getMonthName(ay);
            System.out.println(yil + " yili " + ayAdi + " ayi " + gunSayisi + " gun");
        } else {
            System.out.println("Hatalı bir ay girdiniz!");
        }

        scanner.close();
    }

    public static int getValidInput(Scanner scanner, String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);
            input = scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public static int getDayCount(int ay, int yil) {
        int gunSayisi = 0;

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gunSayisi = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                gunSayisi = 30;
                break;
            case 2:
                gunSayisi = isLeapYear(yil) ? 29 : 28;
                break;
            default:
                gunSayisi = -1;
                break;
        }

        return gunSayisi;
    }

    public static boolean isLeapYear(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
    }

    public static String getMonthName(int ay) {
        String[] ayAdlari = {
                "Ocak", "Subat", "Mart", "Nisan",
                "Mayis", "Haziran", "Temmuz", "Agustos",
                "Eylul", "Ekim", "Kasim", "Aralik"
        };

        if (ay >= 1 && ay <= 12) {
            return ayAdlari[ay - 1];
        } else {
            return "Hatalı ay numarası!";
        }
    }

}
