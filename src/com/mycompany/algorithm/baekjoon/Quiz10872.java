package com.mycompany.algorithm.baekjoon;

import java.util.Scanner;

public class Quiz10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 1;

        for(int i=1; i<=n; i++) {
            m *= i;
        }
        System.out.println(m);

    }

}
