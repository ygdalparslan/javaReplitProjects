package com.Collections;
/*
Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
```
Beklenen Çıktı:
``````
Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
``````
LinkedList Tersi:
``````
mor
``````
beyaz
``````
kirmizi
``````
yesil
``````
mavi
``````
sari
```
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class Collection09 {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();//LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

        colors.add("sari");
        colors.add("mavi");
        colors.add("yesil");
        colors.add("kirmizi");
        colors.add("beyaz");
        colors.add("mor");

        ListIterator<String> itrColors = colors.listIterator();

        System.out.println("Orijinal linked list: "+colors);
        System.out.println("\nLinkedList Tersi: ");

        while (itrColors.hasNext()){
            itrColors.next();
        }

        while (itrColors.hasPrevious()){

            String reverseItr=itrColors.previous();

            System.out.println(reverseItr);
        }

    }



}
