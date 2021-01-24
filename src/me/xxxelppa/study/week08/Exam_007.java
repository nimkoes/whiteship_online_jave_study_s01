package me.xxxelppa.study.week08;

public class Exam_007 {
    public static void main(String[] args) {
        System.out.println(" :: " + MyStaticTestClass.static_value);
        MyStaticTestClass.static_method();
        
        // Non-static field 'non_static_value' cannot be referenced from a static context
        // System.out.println(" :: " + MyStaticTestClass.non_static_value);
        
        // Non-static method 'non_static_method()' cannot be referenced from a static context
        // MyStaticTestClass.non_static_method();
    }
}

class MyStaticTestClass {
    public int non_static_value = 10;
    public static int static_value = 20;
    
    public void non_static_method() { }
    public static void static_method() { }
}
