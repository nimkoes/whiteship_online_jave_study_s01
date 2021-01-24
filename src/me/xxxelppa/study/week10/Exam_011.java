package me.xxxelppa.study.week10;

public class Exam_011 {
    public static void main(String[] args) {
        MySharedClass mySharedClass = new MySharedClass();
        int workCount = 3;
        
        MyWorker_1 myWorker_1 = new MyWorker_1(mySharedClass, workCount);
        MyWorker_2 myWorker_2 = new MyWorker_2(mySharedClass, workCount);
        
        myWorker_1.start();
        myWorker_2.start();
        
    }
}

class MySharedClass {
    public synchronized void doWork_worker_1() {
        System.out.println("worker 1 작업 중");
        notify();
        try { wait(); } catch (InterruptedException e) { }
    }
    
    public synchronized void doWork_worker_2() {
        System.out.println("worker 2 작업 중");
        notify();
        try { wait(); } catch (InterruptedException e) { }
    }
}

class MyWorker_1 extends Thread {
    MySharedClass mySharedClass;
    int workCount;
    
    public MyWorker_1(MySharedClass mySharedClass, int workCount) {
        this.workCount = workCount;
        this.mySharedClass = mySharedClass;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < workCount; ++i) {
            mySharedClass.doWork_worker_1();
        }
    }
}

class MyWorker_2 extends Thread {
    MySharedClass mySharedClass;
    int workCount;
    
    public MyWorker_2(MySharedClass mySharedClass, int workCount) {
        this.workCount = workCount;
        this.mySharedClass = mySharedClass;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < workCount; ++i) {
            mySharedClass.doWork_worker_2();
        }
    }
}