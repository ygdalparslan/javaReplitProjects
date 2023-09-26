package com.Collections;

import java.util.Iterator;
import java.util.TreeSet;

/*
Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından  descendingIterator()
fonksiyonunu kullanarak ters sıradan yazdıralım.

TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
```
Beklenen Çıktı:
``````
Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
``````
Tersten Siralanisi:
``````
yesil
``````
turuncu
``````
sari
``````
mavi
``````
kirmizi
```
 */
public class Collection14 {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();
        colors.add("yesil");
        colors.add("sari");
        colors.add("mavi");
        colors.add("turuncu");
        colors.add("kirmizi");

        System.out.println("Orjinal Tree sonucu: " + colors);

        for (Iterator<String> itrColors = colors.descendingIterator(); itrColors.hasNext(); ) {
            String w = itrColors.next();
            System.out.println(w);
        }

    }
}
