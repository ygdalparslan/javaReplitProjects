package com.Scanner;

import java.util.Scanner;

/*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

  Örnek Çıktı:
  Alan: 32
  Çevre: 24

  */
public class Scanner03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin kısa kenarını giriniz..");
        int kisaKenar = scan.nextInt();
        System.out.println("Lütfen Dikdörtgenin kısa kenarını giriniz..");
        int uzunKenar = scan.nextInt();

        int alan = kisaKenar*uzunKenar;
        int cevre =2*(kisaKenar+uzunKenar);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }

}
