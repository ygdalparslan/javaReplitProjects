package com.Syso;

    /*
        Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)

        int a= 3;
        int b= 5;
        Ornek Cikti:
        a=5
        b=3

      */
public class Syso07 {

        public static void main(String[] args) {

            int a = 3;
            int b = 5;

            a = a+b; //a =8
            b = a-b; //b =3
            a = a-b; //a =5

            System.out.println("a = " + a);
            System.out.println("b = " + b);


        }
}
