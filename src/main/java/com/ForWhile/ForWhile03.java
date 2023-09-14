package com.ForWhile;

/*
  Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :
String str=“Javaisalsoeasy”
Output: a s
  */

import java.util.ArrayList;
import java.util.List;

public class ForWhile03 {
    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        String str2 ="";

        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == i && str.lastIndexOf(c) !=i){
                str2+=c+" ";
            }
        }
        System.out.println(str2);
    }
}
