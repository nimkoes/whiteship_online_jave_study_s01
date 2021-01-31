package me.xxxelppa.study.week12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exam_010 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        
        Method[] declaredMethods = MyTest_010.class.getDeclaredMethods();
        
        for (Method declaredMethod : declaredMethods) {
            // MyAnnotation_07 annotation 이 있을 경우
            if (declaredMethod.isAnnotationPresent(MyAnnotation_07.class)) {
                
                // MyAnnotation_07 객체
                MyAnnotation_07 myAnnotation_07 = declaredMethod.getAnnotation(MyAnnotation_07.class);
                
                for(int i = 0; i < myAnnotation_07.loopCnt(); ++i) {
                    declaredMethod.invoke(new MyTest_010());
                }
            }
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation_07 {
    int loopCnt() default 1;
}

class MyTest_010 {
    @MyAnnotation_07(loopCnt = 10)
    public void printStarLine() {
        System.out.print("*");
    }
}