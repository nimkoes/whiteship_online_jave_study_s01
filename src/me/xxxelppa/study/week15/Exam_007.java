package me.xxxelppa.study.week15;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Exam_007 {
    public static void main(String[] args) {
        
        BiFunction<String, Integer, ConstructorRefTest> bf;
        Function<String, ConstructorRefTest> f;
        Supplier<ConstructorRefTest> s;
        
        bf = (param_1, param_2) -> new ConstructorRefTest(param_1, param_2);
        System.out.println(bf.apply("nimkoes", 17).toString());
    
        System.out.println();
        
        s = ConstructorRefTest::new;
        System.out.println("기본 생성자 : " + s.get().toString());
        
        f = ConstructorRefTest::new;
        System.out.println("String 하나를 받는 생성자 : " + f.apply("nimkoes").toString());
        
        bf = ConstructorRefTest::new;
        System.out.println("String, int 두 개를 받는 생성자 : " + bf.apply("xxxelppa", 71).toString());
        
    }
}

class ConstructorRefTest {
    String name;
    int age;
    
    public ConstructorRefTest() {
    }
    
    public ConstructorRefTest(String name) {
        this.name = name;
    }
    
    public ConstructorRefTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "ConstructorRefTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}