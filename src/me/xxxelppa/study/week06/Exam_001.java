package me.xxxelppa.study.week06;

public class Exam_001 {
    public static void main(String[] args) {
        MyType[] mt = new MyType[10];
        
        for(int i = 0; i < mt.length; ++i) {
            mt[i] = new MyType();
        }
    }
}

class MyType {}