package com.mycompany.algorithm.progammers;

public class RecommendId {

    public static String RecommendId(String new_id) {
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String idToLowerCase = new_id.toLowerCase();

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String reg = "[^\\da-z.\\-_]";
        String idReplace = idToLowerCase.replaceAll(reg, "");

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        // String reg2 = "[.{2,}?]";
        String reg2 = ".{2,}?";
        String idReplaceAll = idReplace.replaceAll(reg2, "Q");


        return idReplaceAll;
    }

    public static void main(String[] args) {
        String id = RecommendId("...!@BaT#*..y.abcdefghijklm");
        System.out.println(id);

    }

}
