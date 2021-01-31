package me.xxxelppa.study.week12;

@MyAnnotation_01
public class Exam_004 {
}

@interface MyAnnotation_01 {
    String name() default "nimkoes";
    int age() default 23;
}