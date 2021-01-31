package me.xxxelppa.study.week12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Exam_009 {

    @MyAnnotation_06
    private String name;

    @MyAnnotation_06
    public void method() {
    }
}

@Target({ElementType.FIELD, ElementType.METHOD})
@interface MyAnnotation_06 {
}