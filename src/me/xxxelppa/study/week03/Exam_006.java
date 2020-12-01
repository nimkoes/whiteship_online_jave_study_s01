package me.xxxelppa.study.week03;

public class Exam_006 {
    public static void main(String[] args) {
        boolean myTrue = true;
        boolean myFalse = false;
        
        if (myTrue & myFalse)  System.out.println("if test 1 > myTrue 와 myFalse 는 모두 true 입니다.");
        if (myTrue | myFalse)  System.out.println("if test 2 > myTrue 와 myFalse 둘 중 하나는 true 입니다.");
        if (myTrue && myFalse) System.out.println("if test 3 > myTrue 와 myFalse 는 모두 true 입니다.");
        if (myTrue || myFalse) System.out.println("if test 4 > myTrue 와 myFalse 둘 중 하나는 true 입니다.");
        
        if (!myFalse) System.out.println("!myFalse 의 결과는 true 입니다.");
        
    }
}