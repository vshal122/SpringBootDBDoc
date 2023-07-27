package com.rakuten.StudentApp.Practise;

import java.util.*;

 class TestCase {
    String Name;
    int rollNo;
    String Address;

    public TestCase(String name, int rollNo, String address) {
        Name = name;
        this.rollNo = rollNo;
        Address = address;
    }

    public TestCase() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}
public   class Main{
    public static void main(String[] args) {

        TestCase testCase1 = new TestCase("Mohan", 1, "indore");
        TestCase testCase2 = new TestCase("Mohan", 2, "indore");
        TestCase testCase3 = new TestCase("Mohan", 3, "indore");
        TestCase testCase4 = new TestCase("Rohan", 1, "ujjain");
        TestCase testCase5 = new TestCase("Rohan", 2, "Ujjain");
        TestCase testCase6 = new TestCase("Sohan", 1, "Ujjain");
        TestCase testCase7 = new TestCase("Manish", 1, "Bhopal");
        TestCase testCase8 = new TestCase("Manish", 2, "Bhopal");
        TestCase testCase9 = new TestCase("Manish", 3, "Bhopal");
        List<TestCase> testCaseList = new ArrayList<>();
        Collections.addAll(testCaseList, testCase1, testCase2, testCase3, testCase4, testCase5, testCase6, testCase7, testCase8, testCase9);
        System.out.println(testCaseList);
        Comparator<TestCase> ComCaseComparator = Comparator.comparing(TestCase::getRollNo);
        Collections.sort(testCaseList,ComCaseComparator);
//        Map<String,Integer> newMap = new HashMap<>();
//        List<TestCase> sortedList = testCaseList.stream()
//                .sorted((o1, o2) -> {
//                    if(o1.getRollNo() == o2.getRollNo())
//                    {
//                        newMap.put(o1.getName(),o2.getRollNo());
//                        return o1.getName().compareTo(o2.getName()); }
//                    else if(o1.getRollNo() > o2.getRollNo()) {
//                        return 1;
//                    }
//                else return -1;
//
//                })
//                .collect(Collectors.toList());

        for (TestCase tc : testCaseList) {
            System.out.println(tc.getName() + "  :" + tc.getRollNo());
        }


    }
}
