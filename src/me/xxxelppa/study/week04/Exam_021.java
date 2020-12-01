package me.xxxelppa.study.week04;

public class Exam_021 {
    public static void main(String[] args) {
        System.out.println("================================= 피보나치 수열 =================================");
        for(int cnt = 0, bf = 0, af = 1; cnt++ < 30; System.out.print(cnt == 1 ? "1\t" : (af += bf) + (cnt % 10 == 0 ? "\n" : "\t")), bf = cnt == 1 ? bf : af - bf);
    }
}