package com.Collections;
/*
Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
```
Beklenen Çıktı:
``````
beyaz
``````
kirmizi
``````
mavi
``````
sari
``````
siyah
``````
yesil
```
 */

import java.util.TreeSet;

public class Collection13 {
    public static void main(String[] args) {

        TreeSet<String> trsColors = new TreeSet<>();

        trsColors.add("yesil");
        trsColors.add("mavi");
        trsColors.add("kirmizi");
        trsColors.add("sari");
        trsColors.add("beyaz");
        trsColors.add("siyah");

        for (String w: trsColors) {
            System.out.println(w);
        }
    }
}
