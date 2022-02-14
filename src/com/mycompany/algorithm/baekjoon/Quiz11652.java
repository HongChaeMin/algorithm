package com.mycompany.algorithm.baekjoon;

import java.util.*;

public class Quiz11652 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> cardList = new ArrayList<>();
        Map<Integer, Integer> total = new HashMap<>();
        Set<Integer> set = total.keySet();
        int result = 0, resultTotal = 0;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int inputValue = sc.nextInt();
            cardList.add(inputValue);
            result = inputValue > result ? inputValue : result;
        }

        for (int i = 0; i < cardList.size(); i++) {
            if (total.containsKey(cardList.get(i))) {
                total.put(cardList.get(i), total.get(cardList.get(i)) + 1);
            } else {
                total.put(cardList.get(i), 1);
            }
        }

        for(Integer key : set) {
            if (total.get(key) > resultTotal) {
                resultTotal = total.get(key);
            }

            if (total.get(key) == resultTotal && result > key) {
                result = key;
            }
        }

        System.out.println(result);
        System.out.println(resultTotal);

        sc.close();

    }

}
