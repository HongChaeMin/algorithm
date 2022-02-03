package com.mycompany.algorithm.baekjoon;

import java.util.Scanner;

public class Quiz1032 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String[] strArr = new String[length];
        String result = "";


        for (int i = 0; i < length; i++) {
            strArr[i] = sc.next();
        }

        String[] strArrays = strArr[0].split("");

        for (int i = 0; i < strArr[0].length(); i++) {
            boolean check = true;

            for (int j = 0; j < length; j++) {
                if (!strArrays[i].equals(strArr[j].substring(i, i + 1))) { check = false; }
            }

            if (check) {result += strArrays[i]; }
            else {result += "?"; }
        }

        System.out.println(result);

        sc.close();
    }

}
