package me.xxxelppa.study.week14;

import java.util.ArrayList;
import java.util.List;

public class Exam_010 {
    
    public static <T extends Number> double getSum(List<T> list) {
        double sum = 0.0;
        for(T t : list) sum += t.doubleValue();
        return sum;
    }
    
    public static void main(String[] args) {
        List<Number> myNumber = new ArrayList<>();
        myNumber.add(10);
        myNumber.add(2.5);
    
        System.out.println(getSum(myNumber));
    }
}