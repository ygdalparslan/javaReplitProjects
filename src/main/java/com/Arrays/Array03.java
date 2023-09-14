package com.Arrays;
/*

Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
Array =  [20, 30, 25, 35, -16, 60, -100 ]
```
Beklenen Çıktı:
```

```
Array Sayılarının ortalaması: 7.0
```
 */

public class Array03 {
    public static void main(String[] args) {

        int nums[] = {20, 30, 25, 35, -16, 60, -100};
        double average =0;
        int sum =0;
        for (int w : nums){
            sum+=w;
        }

        System.out.println("Array Sayılarının ortalaması: " +Math.round((sum / nums.length)*10.0)/10.0);




    }
}
