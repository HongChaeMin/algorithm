package com.mycompany.algorithm.progammers;

import java.util.*;

public class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
        List<Person> personList = makePersonList(id_list);


        // 신고된 사람, 신고한 사람 분리
        Set<String> setList = new HashSet<>(Arrays.asList(report));

        List<String> reporterList = new ArrayList<>();
        List<String> personReportedList = new ArrayList<>();

        for (String names : setList) {
            String[] declaration = names.split(" ");
            reporterList.add(declaration[0]);
            personReportedList.add(declaration[1]);
        }

        // 신고를 한 사람의 이름과 신고당한 횟수 계산
        for (Person person : personList) {
            for (int j = 0; j < reporterList.size(); j++) {
                // 신고한 사람 이름 넣기
                if (person.getPersonName().equals(reporterList.get(j)) && !person.checkReportedPersonDuplicate(personReportedList.get(j))) {
                    person.addReportedPersonNameList(personReportedList.get(j));
                }
                // 신고 당했으면 신고 횟수 추가
                if (person.getPersonName().equals(personReportedList.get(j))) {
                    person.addReportedCount();
                }
            }
        }

        // 메일 받는 횟수 계산
        for (int i = 0; i < personList.size(); i++) {
            for (Person person : personList) {
                if (personList.get(i).getReportedCount() >= k && person.getReportedPersonNameList().contains(personList.get(i).getPersonName())) {
                    person.addReceiveMailCount();
                }
            }
        }

        return makeAnswer(id_list.length, personList);
    }

    public List<Person> makePersonList(String[] id_list) {
        List<Person> personList = new ArrayList<>();
        for(String id : id_list) {
            personList.add(new Person(id));
        }
        return personList;
    }

    public int[] makeAnswer(int arrLength, List<Person> personList) {
        int[] answer = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            Person person = personList.get(i);
            answer[i] = person.getReceiveMailCount();
        }
        return answer;
    }

    static class Person {
        public String personName;

        public List<String> reportedPersonNameList = new ArrayList<>();

        public int reportedCount = 0;

        public int receiveMailCount = 0;

        public Person(String name) {
            this.personName = name;
        }

        public void addReportedCount() {
            this.reportedCount++;
        }

        public void addReportedPersonNameList(String personName) {
            this.reportedPersonNameList.add(personName);
        }

        public void addReceiveMailCount() {
            this.receiveMailCount++;
        }

        public boolean checkReportedPersonDuplicate(String personName) {
            return reportedPersonNameList.contains(personName);
        }

        public String getPersonName() {
            return personName;
        }

        public int getReportedCount() {
            return reportedCount;
        }

        public List<String> getReportedPersonNameList() {
            return reportedPersonNameList;
        }

        public int getReceiveMailCount() {
            return receiveMailCount;
        }

        @Override
        public String toString() {
            return "personName : " + this.personName + " \t reportedPersonNameList : " + this.reportedPersonNameList + " \t reportedCount : " + this.reportedCount + " \t receiveMailCount : " + receiveMailCount;
        }

    }

    public static void main(String[] args) {
        /*String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};*/
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        Solution solution = new Solution();

        int[] answer = solution.solution(idList, report, 2);
    }

}