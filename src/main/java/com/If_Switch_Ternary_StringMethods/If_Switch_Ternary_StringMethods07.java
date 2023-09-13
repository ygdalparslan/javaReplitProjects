package com.If_Switch_Ternary_StringMethods;

/*
2 kelime oluşturun: isim1 ve isim2

        // isim1 çift sayıda karakter içeriyorsa,
        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa
        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet
        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor
 */

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim1'i giriniz.");
        String isim1 = scan.next();
        System.out.println("Lütfen isim2'yi giriniz.");
        String isim2 = scan.next();

        if (isim1.length()%2==0){
           String isim1a= isim1.substring(0,isim1.length()/2);
           String isim1b = isim1.substring(isim1.length()/2);

            System.out.println(isim1a+isim2+isim1b);

        }else {
            System.out.println("isim1, isim2 ye eklenemiyor");
        }

    }
}
