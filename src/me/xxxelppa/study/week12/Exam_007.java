package me.xxxelppa.study.week12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Exam_007 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("me.xxxelppa.study.week12.ReflectionTestClass");
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("적용된 annotation : " + annotation.toString());
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation_04 { }

@MyAnnotation_04
class ReflectionTestClass { }