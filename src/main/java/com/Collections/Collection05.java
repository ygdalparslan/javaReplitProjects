package com.Collections;

import java.util.ArrayList;

public class Collection05 {
/*
Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
```
Beklenen Çıktı:
``````
Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
``````
siyah
``````
mavi
``````
kirmizi
``````
yesil
``````
mor
``````
turuncu
```
 */

    public static void main(String[] args) {

        ArrayList<String> arr =new ArrayList<>();
        arr.add("siyah");
        arr.add("mavi");
        arr.add("kirmizi");
        arr.add("yesil");
        arr.add("mor");
        arr.add("turuncu");

        System.out.println("Orjinal array list: "+arr);

        for (String w : arr){

            System.out.println(w);
        }
    }
}
