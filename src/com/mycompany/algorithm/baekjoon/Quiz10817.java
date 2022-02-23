package com.mycompany.algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz10817 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] c = str.split(" ");
        int[] intArr = new int[3];

        for(int i = 0; i < c.length; i++) {
            intArr[i] = Integer.parseInt(c[i]);
        }
        Arrays.sort(intArr);

        System.out.println(intArr[1]);


    }

}
