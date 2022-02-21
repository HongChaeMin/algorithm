package com.mycompany.algorithm.baekjoon;

import java.util.Scanner;

public class Quiz10162 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();

        int fm = 0;
        int om = 0;
        int ts = 0;

        if (time % 10 != 0) {
            System.out.println(-1);
            return;
        }

        while (time > 0) {
            if (time / 500 > 0) {
                time -= 500;
                fm++;
                continue;
            } else if (time / 60 > 0) {
                time -= 60;
                om++;
                continue;
            } else if (time / 10 > 0) {
                time -= 10;
                ts++;
                continue;
            }
        }

        System.out.println(fm + " " + om + " " + ts);
        return;
    }

}
