package com.Collections;
/*
Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
```
Beklenen Çıktı:
``````
Tree Set Elemanlari:
``````
kirmizi
``````
mavi
``````
sari
``````
turuncu
``````
yesil
```
 */

import java.util.HashSet;
import java.util.TreeSet;

public class Collection12 {
    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<>();

        colors.add("sari");
        colors.add("mavi");
        colors.add("yesil");
        colors.add("turuncu");
        colors.add("kirmizi");

        TreeSet<String> trsColors = new TreeSet<>(colors);

        for (String w : trsColors){

            System.out.println(w);
        }
    }
}
