package me.xxxelppa.study.week06;

public class Exam_003 extends SuperTestClass {
    public static void main(String[] args) {
        Exam_003 exam_003 = new Exam_003();
        exam_003.myPrint();
        System.out.println();
    
        System.out.println("어떤 결과 ?");
        exam_003.print();
    }
    
    public void myPrint() {
        super.print();  // 상속 관계에서 부모 클래스에 접근
        print();
    }
    
    public void print() {
        System.out.println("자식 클래스 메소드");
    }
}

class SuperTestClass {
    public void print() {
        System.out.println("부모 클래스의 메소드");
    }
}