package me.xxxelppa.study.week14;

import java.util.Arrays;

public class Exam_013<T> {
    private T[] myArray;
    
    Exam_013(int size) {
//        myArray = new T[size];  // Type parameter 'T' cannot be instantiated directly
        myArray = (T[]) new Object[size];
    }
    
    public void addElem(int index, T t) {
        myArray[index] = t;
    }
    
    public void printElem() {
        System.out.println(Arrays.toString(myArray));
    }
    
    public static void main(String[] args) {
        Exam_013<String> e2 = new Exam_013<>(3);
        e2.addElem(0, "java");
        e2.addElem(1, "generic");
        
        e2.printElem();
    }
}