package me.xxxelppa.study.week04;

public class Exam_018 {
    public static void main(String[] args) {
        
        //사용자가 입력한 값이라고 가정한다.
        int userInput = 10;
        
        System.out.println(getSum(userInput));
        
    }
    
    public static int getSum(int target) {
        int result = 0;
        int adder = 1;
    
        while (true) {
            
            if (adder > target) break;
        
            result += adder++;
        }
        
        return result;
    }
}