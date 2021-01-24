package me.xxxelppa.study.week10;

public class Exam_006 {
    public static Object myLockObj_1 = new Object();
    public static Object myLockObj2 = new Object();
    
    public static void main(String[] args) {
        MyThread_1 myThread_1 = new MyThread_1();
        MyThread_2 myThread_2 = new MyThread_2();
        
        myThread_1.start();
        myThread_2.start();
    }
    static class MyThread_1 extends Thread {
        @Override
        public void run() {
            synchronized (myLockObj_1) {
                System.out.println("Thread 1 : Holding [myLockObj_1]");
                try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace();}
                System.out.println("Thread 1 : Waiting for [myLockObj_2]");
                synchronized (myLockObj2) {
                    System.out.println("Thread 1 : Holding [myLockObj_1] & [myLockObj_2]");
                }
            }
        }
    }
    
    static class MyThread_2 extends Thread {
        @Override
        public void run() {
            synchronized (myLockObj2) {
                System.out.println("Thread 2 : Holding [myLockObj_2]");
                try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println("Thread 2 : Waiting for [myLockObj_1]");
                synchronized (myLockObj_1) {
                    System.out.println("Thread 2 : Holding [myLockObj_1] & [myLockObj_2]");
                }
            }
        }
    }
}