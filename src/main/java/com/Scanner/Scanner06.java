package com.Scanner;

import java.util.Scanner;

public class Scanner06 {


/*
  Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
  */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen ir Float değer giriniz.");

        float flt = scan.nextFloat();
        short shrt =(short)flt;

        System.out.println(shrt);


    }
}
