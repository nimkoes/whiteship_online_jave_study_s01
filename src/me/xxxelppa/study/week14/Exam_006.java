package me.xxxelppa.study.week14;

public class Exam_006 {
    
    public static <T> T myGenericTest(T t) {
        return t;
    }
    
    public static void main(String[] args) {
        System.out.println(myGenericTest("자몽"));
        System.out.println(myGenericTest(1500));
    }
}