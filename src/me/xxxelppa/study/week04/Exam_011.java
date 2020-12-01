package me.xxxelppa.study.week04;

public class Exam_011 {
    public static void main(String[] args) {
        int i = 0, j = 10;
        for(; i != j; ) {
            System.out.println(i + " :: "+ j);
            ++i;
            --j;
        }
    }
}