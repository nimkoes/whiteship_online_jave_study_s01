package me.xxxelppa.study.week14;

import java.util.Arrays;
import java.util.List;

public class Exam_011 {
    public static void main(String[] args) {
        // List 의 요소 타입으로 제한을 두지 않음
        List<?> wildcard_test = Arrays.asList(
                new Root(),
                new Sub_01(),
                new Sub_02(),
                new Sub_02_Sub(),
                new Exam_011()
        );
        
        // List 의 요소 타입으로 Sub_02 또는 Sub_02 하위 타입으로 제한
        List<? extends Sub_02> wildcard_extends_test = Arrays.asList(
                new Sub_02(),
                new Sub_02_Sub()
        );
        
        // List 의 요소 타입으로 Sub_01 또는 Sub_01 상위 타입으로 제한
        List<? super Sub_01> wildcard_super_test = Arrays.asList(
                new Root(),
                new Sub_01()
        );
    
        wildcard_test.forEach(System.out::println);
        System.out.println();
        wildcard_extends_test.forEach(System.out::println);
        System.out.println();
        wildcard_super_test.forEach(System.out::println);
    }
}

class Root {}
class Sub_01 extends Root {}
class Sub_02 extends Root {}
class Sub_02_Sub extends Sub_02 {}