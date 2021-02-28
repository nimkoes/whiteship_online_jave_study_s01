package me.xxxelppa.study.week15;

public class Exam_001 {
    public static void main(String[] args) {
        Exam_001_Sub exam_001_sub = new Exam_001_Sub();
        exam_001_sub.doSomething();
    }
}

interface AnonymousTest_001 {
    void doSomething();
}

// 인터페이스를 구현한 클래스 정의
class Exam_001_Sub implements AnonymousTest_001 {
    @Override
    public void doSomething() {
        System.out.println("do something !!");
    }
}