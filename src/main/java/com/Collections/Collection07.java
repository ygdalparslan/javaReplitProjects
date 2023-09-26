package com.Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

/*
bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
1. elemandan itibaren yazdıralım.
```
 Beklenen Çıktı:
```
```
beyaz
```
```
mavi
```
```
yesil
```
```
turuncu
```
 */
public class Collection07 {

    public static void main(String[] args) {

        LinkedList<String> strList = new LinkedList<>();

        strList.add("sari");
        strList.add("beyaz");
        strList.add("mavi");
        strList.add("yesil");
        strList.add("turuncu");

        Iterator<String> strItr = strList.iterator();

        while (strItr.hasNext()) {
            String el = strItr.next();

            if (el.contains("sari")) {

                strItr.remove();
            }
        }

        for (int i = 0; i <strList.size() ; i++) {

            System.out.println(strList.get(i));
            
        }

    }

}
