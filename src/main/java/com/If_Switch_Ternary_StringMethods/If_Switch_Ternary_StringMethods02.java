package com.If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods02 {

    /*

        John White
        1234234534561478
        Output : Name :
        J*** W****
        CCN  : **** **** **** 1478
        * Ilk Harfler Buyuk harf ile baslamalidir.

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String name = scan.nextLine();
        System.out.println("TC giriniz");
        String kartNo = scan.nextLine();

        String name1 = name.trim().toUpperCase().split(" ")[0];
        String name2 = name.trim().toUpperCase().split(" ")[1];

        name1 = name1.charAt(0) + name1.toLowerCase().substring(1).replaceAll("[a-z]", "*");
        name2 = name2.charAt(0) + name2.toLowerCase().substring(1).replaceAll("[a-z]", "*");

        System.out.println("Name : " + name1 + " " + name2);

        String ccn1 = kartNo.substring(0, 4).replaceAll("[0-9]", "*");
        String ccn2 = kartNo.substring(4, 8).replaceAll("[0-9]", "*");
        String ccn3 = kartNo.substring(8, 12).replaceAll("[0-9]", "*");
        String ccn4 = kartNo.substring(12);

        System.out.println("CCN  : " + ccn1 + " " + ccn2 + " " + ccn3 + " " + ccn4);
    }
}
