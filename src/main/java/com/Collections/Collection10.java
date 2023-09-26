package com.Collections;

import java.util.Collections;
import java.util.LinkedList;


/*
Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
**hint:  Collections.swap();**
```
Beklene Çıktı:
``````
Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
``````
Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
```
 */
public class Collection10 {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("mavi");
        colors.add("kirmizi");
        colors.add("beyaz");
        colors.add("siyah");
        colors.add("yesil");
        colors.add("turuncu");

        System.out.println("\nOrjinal LinkedList: "+colors);

        Collections.swap(colors,0,3);
        System.out.println("\nSwap sonrası durum: "+colors);
    }
}
