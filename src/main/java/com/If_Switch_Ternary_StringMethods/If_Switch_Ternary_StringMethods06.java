package com.If_Switch_Ternary_StringMethods;

/*
  Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse
"isim ayni karakterlere sahiptir." yazdirin.
Eger ayni kaakterlere sahip degilse
"Dizenin benzersiz karakterleri var" yazdirin.
Ternary kullanin.
  */

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz");
        String name = input.nextLine();

        String message =name.length()==3 && name.charAt(0)==name.charAt(1) && name.charAt(1)==name.charAt(2)
                ? "isim ayni karakterlere sahiptir."
                : "Dizenin benzersiz karakterleri var";

        System.out.println("message = " + message);

    }
}
