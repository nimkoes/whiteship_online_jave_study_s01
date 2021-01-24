package me.xxxelppa.study.week06;

public class Exam_004 extends SuperClass {
    public Exam_004() {
    }
    
    public static void main(String[] args) {
        Exam_004 exam_004 = new Exam_004();
    }
}

class SuperClass {
    public SuperClass() {
        System.out.println("부모 클래스의 기본 생성자");
    }
}