package com.If_Switch_Ternary_StringMethods;
/*Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
BMI 18,5'in altındaysa zayıfsınız
BMI 18,5 ile 25 arasında ise kilonuz idealdir
BMI 25-30 arasındaysa şişmansınız
BMI 30'dan büyük veya eşitse, obez
Input:
Output:
Agirlik : 71
Boy : 1.72
BMI : 23.99945916711736
Zayifsiniz.*/

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz.");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz.");
        double boy = scan.nextDouble();

        double bmi = kilo / (boy * boy);

        if (bmi < 18.5) {
            System.out.println("Agirlik : " + kilo+"\n"+"Boy : " + boy +"\n" + "BMI : " + bmi+"\n" + "zayıfsınız");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Agirlik : " + kilo+"\n"+"Boy : " + boy +"\n" + "BMI : " + bmi+"\n" + "kilonuz idealdir");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Agirlik : " + kilo+"\n"+"Boy : " + boy +"\n" + "BMI : " + bmi+"\n" + "şişmansınız");
        } else if (bmi >= 30) {
            System.out.println("Agirlik : " + kilo+"\n" +"Boy : " + boy +"\n" + "BMI : " + bmi+"\n" + "obez");
        }else {
            System.out.println("Geçerli bir veri giriniz");
        }

    }
}
