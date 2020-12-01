package me.xxxelppa.study.week04;

public class Exam_012 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        /*
         * for 문 역시 실행 블록이 한 줄이라면 블록 { }을 생략할 수 있다.
         */
        for (int i = 0; i < myArray.length; ++i) sum += myArray[i];
    
        System.out.println("총합 : " + sum);
    }
}