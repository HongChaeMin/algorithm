package com.mycompany.algorithm.baekjoon;

import java.util.Scanner;

public class Quiz11021 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 1;


        int arr[] = new int[n*2];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            if(i%2==0) {
                System.out.println("Case #"+x+": "+(arr[i]+arr[i+1]));
                x++;
            }
        }

    }

}
