package me.xxxelppa.study.week10;

public class Exam_002 {
    public static void main(String[] args) {
        
        new Thread(new MyRunnableClass()).start();
        
    }
}

class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable 인터페이스를 구현하여 쓰레드 생성");
    }
}