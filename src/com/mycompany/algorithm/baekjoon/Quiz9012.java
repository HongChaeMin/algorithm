package com.mycompany.algorithm.baekjoon;

import java.util.Scanner;

public class Quiz9012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            String[] strArr = str.split("");

            int vps1 = 0, vps2 = 0;

            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals("(")) {vps1++; }
                else if (strArr[j].equals(")")) {vps2++; }
            }

            System.out.println(vps1 == vps2 ? "YES" : "NO");
        }

        sc.close();
    }


}
