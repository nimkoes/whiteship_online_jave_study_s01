package me.xxxelppa.study.week06;

public class Exam_006 extends abstract_class_with_abstract_method {
    @Override
    public void print() {
        System.out.println("무조건 구현 해주어야 합니다.");
    }
}

// 추상 메소드를 가지지 않는 추상 클래스
abstract class abstract_class_without_abstract_method { }

// 추상 메소드를 가지는 추상 클래스
abstract class abstract_class_with_abstract_method {
    abstract public void print();
}