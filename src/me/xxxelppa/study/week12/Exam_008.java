package me.xxxelppa.study.week12;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Exam_008 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("me.xxxelppa.study.week12.MyTest_008");

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation.annotationType().equals(MyAnnotation_05.class)) {
                    System.out.println(declaredMethod.toString() + " 메소드에 MyAnnotation_05 가 적용되어 있습니다.");
                }
            }
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation_05 {}

class MyTest_008 {
    @MyAnnotation_05
    public void print_with_annotation() { }
    public void print_without_annotation() { }
}