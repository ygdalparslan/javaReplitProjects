package com.Arrays;
/*
Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]
```
Aranan değer:56
```
```
Beklenen Çıktı:
```
```
56 sayısı arrayin 4. elemanı
```
 */

import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {

        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int aranan = 56;


        for (int i = 0; i < arr.length; i++) {

            if (aranan == arr[i]) {
                System.out.println(aranan + " sayısı arrayin " + i + ". elemanı");
            }
        }
    }
}
