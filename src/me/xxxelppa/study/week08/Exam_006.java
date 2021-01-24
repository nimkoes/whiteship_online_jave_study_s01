package me.xxxelppa.study.week08;

public class Exam_006 implements MyInterface_07 {
    // 인터페이스 내부 메소드를 오버라이딩 하지 않았지만 오류가 발생하지 않는다.
    
    public void doSomething() {
        // 이렇게 호출해서 사용할 수도 있다.
        myTestMethod();
    }
}

interface MyInterface_07 {
    default void myTestMethod() {
        System.out.println("인터페이스도 구현 메소드를 가질 수 있다.");
    }
}