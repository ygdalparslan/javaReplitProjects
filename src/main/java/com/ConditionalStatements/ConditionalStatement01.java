package com.ConditionalStatements;

/*
Girilen sayının pozitif,  negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.
```
Test data :21
``````
Beklenen Çıktı:
``````
 Sayı Pozitif
``````
Test data :-15
``````
Beklenen Çıktı:
``````
 Sayı Negatif
``````
Test data :0
``````
Beklenen Çıktı:
``````
 Sayı Sıfır
```
 */

import java.util.Scanner;

public class ConditionalStatement01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number=scan.nextInt();

        if (number<0){
            System.out.println("Sayı Negatif");
        } else if (number==0) {
            System.out.println("Sayı Sıfır");

        }else {

            System.out.println("Sayı Pozitif");
        }
    }
}
