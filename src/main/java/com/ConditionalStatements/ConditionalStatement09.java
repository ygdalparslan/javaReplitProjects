package com.ConditionalStatements;
/*
Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.

```
Test Data:
```

```
Yarım elmas uzunluğu : 7
```

```
Beklenen Çıktı:
```

```
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
```
 */

public class ConditionalStatement09 {


    public static void main(String[] args) {

        int n = 7;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
