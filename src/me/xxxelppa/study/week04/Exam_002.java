package me.xxxelppa.study.week04;

public class Exam_002 {
    public static void main(String[] args) {
        boolean condition_1 = true;
        boolean condition_2 = false;
        
        if(condition_1 && condition_2) {
            System.out.println("condition_1과 condition_2 모두 참 입니다");
        } else {
            System.out.println("condition_1과 condition_2 중에 거짓이 있습니다.");
        }
    
        if(condition_1 && condition_2) System.out.println("condition_1과 condition_2 모두 참 입니다");
        else System.out.println("condition_1과 condition_2 중에 거짓이 있습니다.");
        
        /*
         * 심지어 이렇게 작성해도 잘 동작 하지만
         * 권장하지 않습니다.
         */
        if(condition_1 && condition_2) {
            System.out.println("condition_1과 condition_2 모두 참 입니다");
        } else System.out.println("condition_1과 condition_2 중에 거짓이 있습니다.");
        
    }
}
