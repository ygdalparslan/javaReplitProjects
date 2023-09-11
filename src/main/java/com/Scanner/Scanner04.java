package com.Scanner;

import java.util.Scanner;

/*

  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

1 şeker = 1.7 gr
Örnek Çıktı:
çay=10
şeker=2
Yılda 12.41 kg şeker kullanıyor.

*/
public class Scanner04 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Günde içtiğiniz çay miktarını giriniz");
        int cayMiktari = scan.nextInt();
        System.out.println("Lütfen kullandığınız şeker miktarını giriniz");
        int sekerMiktari = scan.nextInt();

        double toplamSeker = (365*cayMiktari*(1.7*sekerMiktari))/1000;


        System.out.println("1 Yilda "+toplamSeker+" kg seker kullaniyor.");

    }


}
