package com.Collections;

/*
Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
```
Beklenen Çıktı:
```
```
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
```
```
Listenin ilk elemani: sari
```
```
listenin son elemani: beyaz
```
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collection08 {

    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();

        colors.add("sari");
        colors.add("mavi");
        colors.add("turuncu");
        colors.add("siyah");
        colors.add("yesil");
        colors.add("beyaz");

        ListIterator<String> colorsItr = colors.listIterator();

        String firstElement = colorsItr.next();

        while (colorsItr.hasNext()) {

            colorsItr.next();
        }

        String lastElement = colorsItr.previous();

        System.out.println("Orjinal list elemanlari: " + colors);
        System.out.println("Listenin ilk elemani: " + firstElement);
        System.out.println("listenin son elemani: " + lastElement);


    }
}
