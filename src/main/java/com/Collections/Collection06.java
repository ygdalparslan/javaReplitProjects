package com.Collections;

import java.util.LinkedList;

public class Collection06 {
/*
Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
LinkedList elemanları: sari,mavi,mor,yesil,beyaz
```
Beklenen Çıktı:
``````
sari
``````
mavi
``````
mor
``````
yesil
``````
beyaz
```
 */

    public static void main(String[] args) {

        LinkedList<String> arr = new LinkedList<>();
        arr.add("sari");
        arr.add("mavi");
        arr.add("mor");
        arr.add("yesil");
        arr.add("beyaz");

        for (String w: arr){
            System.out.println(w);

        }
    }
}
