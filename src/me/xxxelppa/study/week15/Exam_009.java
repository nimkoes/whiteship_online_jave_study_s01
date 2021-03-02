package me.xxxelppa.study.week15;

public class Exam_009 {
    public static void main(String[] args) {

        // 변수에 저장
        MyInterface mi = () -> System.out.println("변수에 저장 된 람다식");
        mi.print();

        // 매개변수로 전달
        doProc(() -> System.out.println("매개변수로 전달 된 람다식"));

        // 반환 값으로 사용
        getProc().print();
    }

    public static void doProc(MyInterface mi) {
        mi.print();
    }

    public static MyInterface getProc() {
        return () -> System.out.println("반환 값으로 사용 된 람다식");
    }
}

interface MyInterface {
    void print();
}