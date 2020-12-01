package me.xxxelppa.study.week04;

public class Exam_004 {
    public static void main(String[] args) {
        int point;
        int score = 87;
        
        /*
         * 검수에 따라 point 를 달리 지급하는 예시
         */
        
        // example 1
        point = 0;
        if (score >= 90) ++point;
        else if (score >= 80) ++point;
        else if (score >= 70) ++point;
        else if (score >= 60) ++point;
        
        System.out.println("example 1 : " + point);
        System.out.println();
        
        
        // example 2
        point = 0;
        if (score >= 90) ++point;
        if (score >= 80) ++point;
        if (score >= 70) ++point;
        if (score >= 60) ++point;
        
        System.out.println("example 2 : " + point);
    }
}