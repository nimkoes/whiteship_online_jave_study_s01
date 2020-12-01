package me.xxxelppa.study.week04;

public class Exam_019 {
    public static void main(String[] args) {
        
        //사용자가 입력한 값이라고 가정한다.
        int userInput = 10;
        
        System.out.println(getSum(userInput));
        
    }
    
    public static int getSum(int target) {
        int result = 0;
        
        for(int adder = 1; adder <= target; ++adder) {
            if(adder % 2 != 0) continue;
            
            result += adder;
        }
        
        return result;
    }
}