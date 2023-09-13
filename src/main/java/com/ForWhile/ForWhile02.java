package com.ForWhile;

import java.util.Scanner;

/*
Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :
30
40
	Beklenen Cikti:
30 ve 40 icin GCD = 10
30 ve 40 icin LCM = 120
 */
public class ForWhile02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int firstNum = scan.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int secondNum = scan.nextInt();

        int GCD = 1;
        int max = Math.max(firstNum, secondNum);

        for (int i = 1; i <= max; i++) {

            if (firstNum % i == 0 && secondNum % i == 0) {
                GCD = i;
            }
        }
        int LCD = (firstNum * secondNum) / GCD;

        System.out.println(firstNum + " ve " + secondNum + " icin GCD = " + GCD);
        System.out.println(firstNum + " ve " + secondNum + " icin LCM = " + LCD);

    }
}
