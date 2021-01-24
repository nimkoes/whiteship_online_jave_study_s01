package me.xxxelppa.study.week08;

public class Exam_005 implements MyInterface_05, MyInterface_06 {
    @Override
    public void test() {
        System.out.println("한 번만 오버라이딩 하면 된다.");
    }
}

interface MyInterface_05 { void test(); }
interface MyInterface_06 { void test(); }