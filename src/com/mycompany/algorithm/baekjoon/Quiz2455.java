package com.mycompany.algorithm.baekjoon;

import java.util.Scanner;

public class Quiz2455 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result = 0;

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            String str = sc.nextLine();
            String[] check = str.split(" ");
            sum -= Integer.parseInt(check[0]);
            sum += Integer.parseInt(check[1]);
            if (result < sum) {
                result = sum;
            }
        }

        System.out.println(result);

    }

}
