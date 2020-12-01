package me.xxxelppa.study.week03;

public class Exam_007 {
    public static void main(String[] args) {
        MyParents_0 myParents_0 = new MyParents_0();
        MyParents_1 myParents_1 = new MyParents_1();
        MyParents_2 myParents_2 = new MyParents_2();
    
        System.out.println("expect false :: " + (myParents_0 instanceof MyInterface));
        System.out.println("expect true  :: " + (myParents_1 instanceof MyInterface));
        System.out.println("expect true  :: " + (myParents_2 instanceof MyInterface));
    
        System.out.println("expect true  :: " + (myParents_1 instanceof MyParents_2));
        
        /*
         * instanceof 연산 결과가 true 일 경우
         * 해당 타입의 변수에 값을 할당할 수 있다.
         */
        if (myParents_1 instanceof MyInterface) {
            MyInterface myInterface = new MyParents_1();
            System.out.println("자신의 상위 타입의 변수에 값을 할당할 수 있다. :: " + (myInterface != null));
        }
    }
}

class MyParents_0 {}
class MyParents_1 extends MyParents_2 {}
class MyParents_2 implements MyInterface {}
interface MyInterface {}
