package me.xxxelppa.study.week08;

public class Exam_009 implements MyInterface_09 {
    
    // @Override    // Method does not override method from its superclass
    static void my_static_method() {
        System.out.println("오버라이딩 하고 싶은데..");
    }
    
    public static void main(String[] args) {
        my_static_method();
        MyInterface_09.my_static_method();
    }
}

interface MyInterface_09 {
    static void my_static_method() {
        System.out.println("오버라이딩 할 수 없습니다.");
    }
}