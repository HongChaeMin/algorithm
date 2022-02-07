package com.mycompany.algorithm.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz10828 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            String command = sc.nextLine();
            String[] strArr = command.split("\\s");

            switch (strArr[0]) {
                case "push":
                    list.add(Integer.parseInt(strArr[1]));
                    break;
                case "pop":
                    int size = list.size();
                    if (size < 1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(list.get(size - 1));
                        list.remove(size - 1);
                    }
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    System.out.println(list.isEmpty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(list.isEmpty() ? -1 : list.get(list.size() - 1));
                    break;
            }

        }

        sc.close();

    }

}
