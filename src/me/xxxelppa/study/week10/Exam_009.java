package me.xxxelppa.study.week10;

public class Exam_009 {
    public static void main(String[] args) {
        MyThread_1 myThread_1 = new MyThread_1();
        MyThread_2 myThread_2 = new MyThread_2();
        
        myThread_1.start();
        myThread_2.start();
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        System.out.println("========== myThread_1 양보 시작 ==========");
        myThread_1.callYield = true;
        
        try { Thread.sleep(1500); } catch (InterruptedException e) { }
        System.out.println("========== myThread_1 양보 종료 ==========");
        myThread_1.callYield = false;
        
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        myThread_1.isBreak = true;
        myThread_2.isBreak = true;
    }
}

class MyThread_1 extends Thread {
    public boolean isBreak = false;
    public boolean callYield = false;
    
    @Override
    public void run() {
        while(!isBreak) {
            if(callYield) {
                Thread.yield();
            } else {
                System.out.println("Thread_1 작업중");
                try { Thread.sleep(300); } catch (InterruptedException e) { }
            }
        }
        System.out.println("Thread_1 작업 종료");
    }
}

class MyThread_2 extends Thread {
    public boolean isBreak = false;
    
    @Override
    public void run() {
        while(!isBreak) {
            System.out.println("\t\tThread_2 작업중");
            try { Thread.sleep(300); } catch (InterruptedException e) { }
        }
        System.out.println("Thread_2 작업 종료");
    }
}