package com.Arrays;
/*
Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
not: Test datadaki değerleri kullanınız.
```
Test Data:
```
```
[1232, 1134,2345,1022]
```
```
[Java, Python, PHP, C#, C Programming, C++]
```
```
Beklenen Çıktı:
```
```
[1022,1134,1232,2345]
```
```
[C Programming, C#, C++, Java, PHP, Python]
```


 */

import java.sql.Array;
import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        int nums [] = {1232, 1134, 2345, 1022};
        String str[] ={"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        Arrays.sort(nums);
        Arrays.sort(str);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(str));


    }
}
