package com.Arrays;

/*
Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
Array: [1,2,3,4,5,6,7,8,9]
```
Beklenen Çıktı:
```
```
Tek Sayilar: 5
```
```
Cift Sayilar: 4
```
 */
import java.util.Arrays;

public class Array09 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int tekSayilar=0;
        int ciftSayilar=0;

        for (int w: arr){

            if (w%2==0){
                ciftSayilar++;

            }else {
                tekSayilar++;
            }
        }

        System.out.println("Tek Sayilar: "+tekSayilar);
        System.out.println("Cift Sayilar: "+ciftSayilar);

    }
}
