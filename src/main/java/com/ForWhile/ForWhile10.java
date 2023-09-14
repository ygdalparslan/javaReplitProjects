package com.ForWhile;

/*
1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

OutPut:
Sayilarin Toplami : 5050
 */
public class ForWhile10 {
    public static void main(String[] args) {

        int sum = 0;
        int num = 0;
        while (num <= 100) {

            sum += num;
            num++;
        }

        System.out.println("Sayilarin Toplami : " + sum);


    }
}
