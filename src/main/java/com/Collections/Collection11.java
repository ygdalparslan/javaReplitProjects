package com.Collections;

/*
HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
HashSet List: sari,mavi,kirmizi,yesil,mor
```
Beklenen Çıktı:
``````
TreeSet elements:
``````
kirmizi
``````
mavi
``````
mor
``````
sari
``````
yesil
```
 */

import java.util.HashSet;
import java.util.TreeSet;

public class Collection11 {
    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<>();
        colors.add("sari");
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("yesil");
        colors.add("mor");

        TreeSet<String> trsColors = new TreeSet<>(colors);

        for (String w : trsColors){

            System.out.println(w);
        }


    }
}
