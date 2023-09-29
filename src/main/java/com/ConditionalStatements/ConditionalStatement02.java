package com.ConditionalStatements;
/*
iki sayıyı kıyaslayan Java kodunu yazınınz.

**Kullanılacak Operatörler**

**Büyüktür >**

**Küçüktür <**

**Büyük yada eşit =>**

**Küçük yada eşit =<**

**Eşittir ==**

**Eşit değildir !=**

**Kullanılacak sayılar 25 ile 39**

Beklenen Örnek Çıktı:

25 != 39
25 < 39
25 <= 39
```
 */

public class ConditionalStatement02 {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 39;

        if (num1 != num2) {
            System.out.println(num1 + " != " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }

        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        }

        if (num1 <= num2) {
            System.out.println(num1 + " <= " + num2);
        }


        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        }

        if (num1 >= num2) {
            System.out.println(num1 + " >= " + num2);
        }

    }

}
