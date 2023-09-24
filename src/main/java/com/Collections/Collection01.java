package com.Collections;

import java.util.ArrayList;

public class Collection01 {
    /*
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
Array elemanları:  siyah,sari,mavi,turuncu
```
Beklenen Çıktı:
```
```
siyah
```
```
sari
```
```
mavi
```
```
turuncu
```
     */

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("siyah");
        arr.add("sari");
        arr.add("mavi");
        arr.add("turuncu");
        for (String w: arr){
            System.out.println(w);
        }
    }
}
