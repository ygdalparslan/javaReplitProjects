package com.ForWhile;


/*
100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT  :
100 98 96 94 92 … … … … 2 0
 */
public class ForWhile05 {

    public static void main(String[] args) {

        for (int i = 100; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
    }
}
