package me.xxxelppa.study.week06;

public class Exam_005 extends OverrideTestClass {
    public static void main(String[] args) {
        Exam_005 exam_005 = new Exam_005();
        exam_005.myPrint();
    }
    
    @Override
    public void myPrint() {
        System.out.println("자식 클래스에서 오버리이딩 한 메소드를 실행 합니다.");
    }
}

class OverrideTestClass {
    public void myPrint() {
        System.out.println("부모 클래스의 myPrint 메소드를 실행 합니다.");
    }
}
