package com.mycompany.algorithm.etc;

public class Main {

    public static void main(String[] args) {

        // 반복문 하나로 구구단 만들기

        int i = 2;
        int j = 0;

        // 1. j 값 증가시키고 초기화 시키기
        // 2. i 값 증가시키기

        while (i <= 9) {
            j++;
            System.out.println(i + " X " + j + " = " + i * j);
            i += j / 9;
            j %= 9;
        }
    }

}
