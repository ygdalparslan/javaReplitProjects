package com.ForWhile;

/*
  Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak
  karakterin isimde kaç kez tekrarlandığını kontrol edin.

    char ch1= 'a' ;
		String name =“John came late"
		Expected Output:
    Number of a = 2
  */


import java.util.Scanner;

public class ForWhile01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen karakter giriniz");
        char chr = scan.next().charAt(0);

        int tekrar = 0;

        for (int i = 0; i < isim.length(); i++) {
            if (chr == isim.charAt(i)) {
                tekrar++;
            }
        }
        System.out.println("Number of a = " + tekrar);

    }
}
