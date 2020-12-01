package me.xxxelppa.study.week04;

import java.util.ArrayList;
import java.util.List;

public class Exam_014 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int sum;
        
        /*
         * 테스트하기 위한 전처리 작업
         * 픽스처 (fixture) 라고도 한다.
         */
        for(int i = 0; i < 100; ++i) list.add(i);
        
        /*
         * size 를 사용했을 때와 사용하지 않았을 때 실행 시간을 비교해 본다.
         */
        
        // 1. 조건부에 size 를 사용했을 경우
        long case_1_start_time = System.nanoTime();
        sum = 0;
        for (int i = 0; i < list.size(); ++i) {
            sum += list.get(i);
        }
        long case_1_end_time = System.nanoTime();
        System.out.println("case 1 :: " + (case_1_end_time - case_1_start_time));
        
        // 2. 조건부에 미리 구해둔 size 를 사용했을 경우
        long case_2_start_time = System.nanoTime();
        sum = 0;
        int size = list.size();
        for (int i = 0; i < size; ++i) {
            sum += list.get(i);
        }
        long case_2_end_time = System.nanoTime();
        System.out.println("case 2 :: " + (case_2_end_time - case_2_start_time));
    }
}