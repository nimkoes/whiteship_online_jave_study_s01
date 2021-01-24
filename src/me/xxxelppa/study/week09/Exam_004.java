package me.xxxelppa.study.week09;

public class Exam_004 {
    public static void main(String[] args) {
        try {
            myMethod_1();
        } catch (Exception e) {
            
            // 예외가 전파되어온 스택을 출력한다.
            e.printStackTrace();
        }
    }
    
    public static void myMethod_1() throws Exception {
        myMethod_2();
    }
    
    public static void myMethod_2() throws Exception {
        myMethod_3();
    }
    
    public static void myMethod_3() throws Exception {
        int a = 10;
        int b = 0;
        
        // 0으로 나누면 예외가 발생한다.
        a = a / b;
    }
}