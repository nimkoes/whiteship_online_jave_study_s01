package me.xxxelppa.study.week10;

public class Exam_003 {
    public static void main(String[] args) {
        Thread myThread_1 = new MyRunnableThread("첫번째 쓰레드");
        Thread myThread_2 = new MyRunnableThread("두번째 쓰레드");
        
        myThread_2.setPriority(Thread.MAX_PRIORITY);
        myThread_1.setPriority(3);
        
        myThread_1.start();
        myThread_2.start();
    }
}

class MyRunnableThread extends Thread {
    public MyRunnableThread(String name) {
        setName(name);
    }
    
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i < 2147483647; ++i) {sum += i;}
        System.out.println(getName());
    }
}