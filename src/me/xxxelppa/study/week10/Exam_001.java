package me.xxxelppa.study.week10;

public class Exam_001 {
    public static void main(String[] args) {
        
        // Runnable 객체를 생성자 매개변수로 념겨줘서 생성하는 방법
        Thread myThread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("MT_1 :: Runnable 객체를 Thread 클래스 생성자 매개변수로 사용");
            }
        });
        
        // 위와 같은 방법이지만, 람다를 사용한 방법
        Thread myThread_2 = new Thread(() -> {
            System.out.println("MT_2 :: 람다를 사용하여 Runnable 객체를 Thread 클래스 생성자 매개변수로 사용");
        });
        
        // Thread 클래스를 상속 받은 클래스를 사용한 방법
        Thread myThread_3 = new MyThreadClass();
        
        // 익명 객체를 사용해서 쓰레드를 생성
        Thread myThread_4 = new Thread() {
            @Override
            public void run() {
                System.out.println("MT_4 :: 익명 객체를 사용");
            }
        };
        
        
        
        // 생성한 쓰레드를 실행하기 위해서는 Thread 클래스의 start 메소드를 사용
        myThread_1.start();
        myThread_2.start();
        myThread_3.start();
        myThread_4.start();
        
    }
}

class MyThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("MT_3 :: Thread 클래스를 상속받아서 생성한 쓰레드 :: run 메소드를 override 한다.");
    }
}