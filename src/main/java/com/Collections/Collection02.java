package com.Collections;

import java.util.ArrayList;

public class Collection02 {
    /*
    Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.

Array List:  siyah,mavi,kirmizi,beyaz
en başa: **pembe**
mavi-kirmizi arasına **yesil**  renk eklenecek.
```
Beklenen Çıktı:
```
```
[pembe,siyah,mavi,yesil,kirmizi,beyaz]
```
     */

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("siyah");
        arr.add("mavi");
        arr.add("kirmizi");
        arr.add("beyaz");

        arr.add(0,"pembe");
        arr.add(3,"yesil");
        System.out.println(arr);

    }
}
