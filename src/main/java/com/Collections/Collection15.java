package com.Collections;

/*
Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
```
Beklenen Çıktı:
``````
Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
``````
ilk elemen: kirmizi
``````
son eleman: yesil
```
 */

import java.util.TreeSet;

public class Collection15 {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();

        colors.add("kirmizi");
        colors.add("mavi");
        colors.add("pembe");
        colors.add("sari");
        colors.add("turuncu");
        colors.add("yesil");

        System.out.println("Orjinal Tree: "+colors);

        System.out.println("ilk elemen: "+colors.first());
        System.out.println("son elemen: "+colors.last());

    }
}
