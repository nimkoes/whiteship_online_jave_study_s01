package me.xxxelppa.study.week15;

public class Exam_003 {
}

interface FunctionalInterface_001 {
    void aaa();
}

// 함수형 인터페이스는 @FunctionalInterface 를 사용해서 명시적으로 컴파일러에게 알려줄 수 있다.
// @FunctionalInterface 를 사용하면 다른 사람이 추상 메소드를 추가하는 상황을 예방할 수 있다.
@FunctionalInterface
interface FunctionalInterface_002 {
    void aaa();
    
    // static 메소드가 있어도 괜찮다.
    static void bbb() { }
    
    // default 메소드가 있어도 괜찮다.
    default void ccc() { }
}