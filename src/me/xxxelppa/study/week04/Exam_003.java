package me.xxxelppa.study.week04;

public class Exam_003 {
    public static void main(String[] args) {
        int score = 87;
    
        if (score >= 90) {
            System.out.println("매우 우수합니다.");
        } else if (score >= 80) {
            System.out.println("준수합니다.");
        } else if (score >= 70) {
            System.out.println("노력이 필요합니다.");
        } else if (score >= 60) {
            System.out.println("많은 노력이 필요합니다.");
        } else {
            System.out.println("뭔가 잘못 되었습니다.");
        }
        
        if (score >= 90) System.out.println("매우 우수합니다.");
        else if (score >= 80) System.out.println("준수합니다.");
        else if (score >= 70) System.out.println("노력이 필요합니다.");
        else if (score >= 60) System.out.println("많은 노력이 필요합니다.");
        else System.out.println("뭔가 잘못 되었습니다.");
        
    }
}