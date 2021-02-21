package me.xxxelppa.study.week14;

import java.util.ArrayList;
import java.util.List;

public class Exam_001 {
    
    public static void printAllIntegers(List list) {
        for(int i = 0; i < list.size(); ++i) {
            System.out.println((int)list.get(i));
        }
    }
    
    public static void printAllStrings(List list) {
        for(int i = 0; i < list.size(); ++i) {
            System.out.println((String)list.get(i));
        }
    }
    
    public static void main(String[] args) {
        List myList_Integers = new ArrayList();
        myList_Integers.add(1);
        myList_Integers.add(2);
        myList_Integers.add(3);
    
        List myList_Strings = new ArrayList();
        myList_Strings.add("가");
        myList_Strings.add("나");
        myList_Strings.add("다");
        
        printAllIntegers(myList_Integers);
        printAllStrings(myList_Strings);
    }
}