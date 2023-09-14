package com.Arrays;

/*
yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]
```
Aranan Değer:2020
```
```
Beklenen Çıktı:**True**
```
```
Aranan Değer:2010
```
```
Beklenen Çıktı :**False**
```
*/

import java.util.Arrays;
import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen aranan değeri giriniz.");
        String aranan = scan.next();

        String arr[] = {"1551", "1223", "1443", "1267", "1789", "1023", "2020"};

        boolean varMi = false;
        for (String w : arr) {

            if (aranan.equals(w)) {
                varMi = true;
            }
        }
        if (varMi == true) {
            System.out.println("**True**");
        } else {
            System.out.println("**False**");
        }

    }
}
