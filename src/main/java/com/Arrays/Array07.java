package com.Arrays;

import java.util.ArrayList;

/*
Array i ARRAYLIST e çeviren Java Kodunu yazınız.

Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
```
Beklenen Çıktı:
```
```
[Python, JAVA, PHP, Perl, C#, C++]
```
 */
public class Array07 {

    public static void main(String[] args) {

        String[] str = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        ArrayList<String> strArray = new ArrayList<>();

        for (String w : str) {
            strArray.add(w);
        }
        System.out.println(strArray);
    }
}
