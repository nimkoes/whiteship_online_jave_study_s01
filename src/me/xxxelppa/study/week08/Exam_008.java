package me.xxxelppa.study.week08;

public class Exam_008 {
    public static void main(String[] args) {
        MyInterface_08.my_static_method();
    }
}

interface MyInterface_08 {
    static void my_static_method() {
        System.out.println("static method 입니다.");
    }
}