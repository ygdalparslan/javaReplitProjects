package com.Collections;
/*
Bir TreeSet oluşturalım ve Tree Listesini ve listedeki eleman sayısını yazdıran java kodunu yazdıralım.
TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
```
Beklenen Çıktı:
``````
Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
``````
Tree eleman sayısı: 5
```
 */

import java.util.TreeSet;

public class Collection16 {

    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();

        //yesil,sari,mavi,kirmizi,pembe

        colors.add("yesil");
        colors.add("sari");
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("pembe");


        System.out.println("\nOrjinal TreeSet: "+colors);

        System.out.println("\nTree eleman sayısı: "+colors.size());
    }
}
