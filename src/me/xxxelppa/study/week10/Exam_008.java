package me.xxxelppa.study.week10;

public class Exam_008 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyInterruptedTest();
        thread.start();
        
        // 2초 후에 interrupted 를 호출한다.
        Thread.sleep(2000);
        System.out.println("interrupt 호출");
        thread.interrupt();
    }
}

class MyInterruptedTest extends Thread {
    @Override
    public void run() {
        boolean flag = true;
        
        while(flag) {
            long sum = 0;
            try {
                System.out.println("쓰레드가 무엇인가 하는중");
                for(long i = 0; i < 2000000000; ++i) sum += i;
                System.out.println("합계 : " + sum);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("쓰레드 작업 종료");
                flag = false;
            }
        }
    }
}