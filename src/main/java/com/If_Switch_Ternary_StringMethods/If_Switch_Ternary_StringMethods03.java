package com.If_Switch_Ternary_StringMethods;

/*
Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:
INPUT      :
25
46
OUTPUT :
Numaralarin Toplami:
71
*/

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        long firtNum = scanner.nextLong();
        System.out.println("Lütfen ikinici sayıyı giriniz");
        long secondNum = scanner.nextLong();

        long sum = firtNum+secondNum;

        if (String.valueOf(sum).length()>10){
            System.out.println("OverFlow");
        }else {
            System.out.println("Numaralarin Toplami: "+sum);
        }


    }
}
