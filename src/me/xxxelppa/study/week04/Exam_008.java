package me.xxxelppa.study.week04;

public class Exam_008 {
    public static void main(String[] args) {
        
        /*
         * 10부터 100까지 출력하는 예시
         *
         * 1. 반복문에서 사용 할 index 를 for 문 초기화식 밖에서 선언
         * 2. index 값을 1씩 증가하지 않고 10씩 증가
         */
        int index;
        for (index = 10; index <= 100; index += 10) {
            System.out.println("index : " + index);
        }
        // index 를 for문 밖에 선언 했기 때문에 for 문 종료 이후 참고하여 사용할 수 있다.
        System.out.println("최종 index : " + index);
        
    }
}