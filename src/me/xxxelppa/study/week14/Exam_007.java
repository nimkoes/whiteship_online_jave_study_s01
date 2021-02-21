package me.xxxelppa.study.week14;

import java.util.ArrayList;
import java.util.List;

public class Exam_007 {
    
    public static <T> void printAll(List<T> list) {
        for(T t : list) {
            System.out.println(t);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> myList_Integers = new ArrayList<>();
        myList_Integers.add(1);
        myList_Integers.add(2);
        myList_Integers.add(3);
        
        List<String> myList_Strings = new ArrayList<>();
        myList_Strings.add("가");
        myList_Strings.add("나");
        myList_Strings.add("다");
        
        printAll(myList_Integers);
        printAll(myList_Strings);
    }
}