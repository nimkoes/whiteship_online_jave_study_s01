package me.xxxelppa.study.week04;

public class Exam_015 {
    public static void main(String[] args) {
        int loopCnt = 10;
        int execCnt = 0;
        
        while(execCnt < loopCnt) {
            System.out.println("현재 " + ++execCnt + "번째 반복 중입니다.");
        }
        System.out.println();
        
        execCnt = 0;
        while(execCnt < loopCnt) System.out.println("현재 " + ++execCnt + "번째 반복 중입니다.");
    }
}