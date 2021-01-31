package me.xxxelppa.study.week12;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * java online study week 12 : annotation test class
 *
 * @author nimkoes
 */
public class Exam_011 {
    
    @MyAnnotation_08(name = "nimkoes", age = 23)
    public void print_documented(String printValue) {
        System.out.println(printValue);
    }
    
    @MyAnnotation_09(nickname = "xxxelppa", age = 24)
    public void print(String printValue) {
        System.out.println(printValue);
    }
}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation_08 {
    String name();
    int age();
}

@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotation_09 {
    String nickname();
    int age();
}