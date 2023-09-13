package com.If_Switch_Ternary_StringMethods;

/*
Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
INPUT   : Mustafa
OUTPUT  : fafafa
*/


import java.util.Scanner;

public class If_Switch_Ternary_StringMethods08 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isim giriniz");
        String isim = scan.next();
        String isim2= isim.substring(isim.length()-2);
        System.out.println(isim2.repeat(3));;

    }
}
