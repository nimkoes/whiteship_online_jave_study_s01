package me.xxxelppa.study.week02;

public class Exam_013 {
    public static void main(String[] args) {
        int[] collect_num = new int[5];

        collect_num[0] = 10;
        collect_num[1] = 20;
        collect_num[2] = 30;
        collect_num[3] = 40;
        collect_num[4] = 50;

        for (int i = 0; i < 5; ++i) {
            System.out.println((i+1) + " 번째 수집한 수 : " + collect_num[i]);
        }
    }
}
