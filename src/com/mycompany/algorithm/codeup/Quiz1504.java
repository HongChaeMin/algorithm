package com.mycompany.algorithm.codeup;

import java.util.Scanner;

public class Quiz1504 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[101][101];

        int r = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    arr[j][i] = r;
                    r++;
                }
            } else {
                for (int j = n; j > 0; j--) {
                    arr[j][i] = r;
                    r++;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for  (int j = 1; j <= n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
