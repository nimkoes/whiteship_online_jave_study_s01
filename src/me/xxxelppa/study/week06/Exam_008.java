package me.xxxelppa.study.week06;

public class Exam_008 {
    public static void main(String[] args) {
        // 정적 디스패치
        Child_01 child_01 = new Child_01();
        child_01.print();
        Child_02 child_02 = new Child_02();
        child_02.print();
        System.out.println();
        
        // 동적 디스패치 (오버라이딩)
        Super dynamic_dispatch_01 = new Child_01();
        dynamic_dispatch_01.print();
        Super dynamic_dispatch_02 = new Child_02();
        dynamic_dispatch_02.print();
        System.out.println();
    }
}

class Super {
    public void print() {
        System.out.println("부모 클래스의 메소드");
    }
}

class Child_01 extends Super {
    @Override
    public void print() {
        System.out.println("자식 01 에서 재정의 한 메소드");
    }
}

class Child_02 extends Super {
    @Override
    public void print() {
        System.out.println("자식 02 에서 재정의 한 메소드");
    }
}