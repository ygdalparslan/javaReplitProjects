package com.Collections;

import java.util.ArrayList;

public class Collection04 {
/*
Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
Array Elemanları: sari,yesil,mavi,pembe
**mavi rengini turuncu ile değiştirelim.**
```
Beklene Çıktı:
```
```
[sari,yesil,mavi,pembe]
```
```
[sari,yesil,turuncu,pembe]
```
 */

    public static void main(String[] args) {


        ArrayList<String> arr = new ArrayList<>();
        arr.add("sari");
        arr.add("yesil");
        arr.add("mavi");
        arr.add("pembe");
        System.out.println(arr);

        arr.set(2,"turuncu");

        System.out.println(arr);

    }
}
