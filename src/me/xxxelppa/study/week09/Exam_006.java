package me.xxxelppa.study.week09;

public class Exam_006 {
    public static void main(String[] args) throws MyException {
        
        throw new MyException("내가 만든 커스텀한 예외");
        
    }
}

class MyException extends Exception {
    
    // super 생성자를 사용하면
    // Exception 클래스의 부모인 Throwable 클래스의 생성자를 호출한다.
    
    public MyException() {
        super();
    }
    
    public MyException(String message) {
        super(message);
    }
}