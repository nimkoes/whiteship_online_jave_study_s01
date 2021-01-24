package me.xxxelppa.study.week10;

public class Exam_007 {
    public static void main(String[] args) {
        ThreadStateChecker threadStateChecker = new ThreadStateChecker(new MyTargetThread());
        threadStateChecker.start();
    }
}

class ThreadStateChecker extends Thread {
    Thread thread;
    
    public ThreadStateChecker(Thread thread) {
        this.thread = thread;
    }
    
    @Override
    public void run() {
        while(true) {
            State myState = thread.getState();
            System.out.println("쓰레드의 상태 : " + myState);
            
            if(myState == State.NEW) thread.start();
            if(myState == State.TERMINATED) break;
            
            // 0.5초 통안 쓰레드 일시 정지
            try { Thread.sleep(500); } catch (Exception e) { }
        }
    }
}

class MyTargetThread extends Thread {
    @Override
    public void run() {
        for(long i = 0; i < 5000000000l; ++i) { }
        
        // 1.5초 동안 쓰레드 일시 정지
        try { Thread.sleep(1500); } catch (Exception e) { }
        
        for(long i = 0; i < 5000000000l; ++i) { }
    }
}