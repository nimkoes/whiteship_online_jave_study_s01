package me.xxxelppa.study.week15;

public class Exam_002 {
    public static void main(String[] args) {
        AnonymousTest_002 anonymousTest_002 = new AnonymousTest_002() {
            @Override
            public void doSomething() {
                System.out.println("do something !!");
            }
        };
    
        anonymousTest_002.doSomething();
    }
}

interface AnonymousTest_002 {
    void doSomething();
}