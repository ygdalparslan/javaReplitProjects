package com.Arrays;

/*
Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
```
Test Data:
```
```
sentence -> "Java is fun"
```
```
reversed **-> "**fun is Java**"**
```
 */

import java.util.Arrays;

public class Array10 {

    public static void main(String[] args) {

        String str = "Java is fun";
        //String[] arrSt =str.split(" ");

        String reversed ="";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed+=str.charAt(i);

        }

        System.out.println(reversed);


    }
}
