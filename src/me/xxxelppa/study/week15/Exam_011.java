package me.xxxelppa.study.week15;

public class Exam_011 {
    public static void main(String[] args) {
    
        MyFunctionalInterface mfi_1 = new MyFunctionalInterface() {
            @Override
            public void doProc() {
                System.out.println("익명 구현 객체");
            }
        };
        mfi_1.doProc();
        
        MyFunctionalInterface mfi_2 = () -> System.out.println("람다식");
        mfi_2.doProc();
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void doProc();
}