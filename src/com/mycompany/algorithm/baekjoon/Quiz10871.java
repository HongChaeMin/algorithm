package com.mycompany.algorithm.baekjoon;

import java.util.Scanner;

public class Quiz10871 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] num = new int[n];

        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(num[i]<x) {
                System.out.print(num[i]+" ");
            }
        }

    }

}
