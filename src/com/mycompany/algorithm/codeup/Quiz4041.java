package com.mycompany.algorithm.codeup;

import java.util.Scanner;

public class Quiz4041 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArray = str.split("");

        for (int i = 0; i < strArray.length / 2; i++) {
            String s = strArray[i];
            strArray[i] = strArray[strArray.length - i - 1];
            strArray[strArray.length - i - 1] = s;
        }

        int num = 0;
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("0")) {
                if((strArray[i].equals(strArray[0]) || strArray[i].equals(strArray[strArray.length - 1]))) {
                    continue;
                }
            }
            System.out.print(strArray[i]);
            num += Integer.parseInt(strArray[i]);
        }
        System.out.println();
        System.out.println(num);
    }

}