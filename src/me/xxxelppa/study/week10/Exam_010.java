package me.xxxelppa.study.week10;

public class Exam_010 {
    public static void main(String[] args) {
        Thread thread = new MyRoom();
        thread.start();
        
        System.out.println("방에 들어가고 싶습니다.");
        
        // main 쓰레드에서 thread 쓰레드가 끝나기를 기다립니다.
        try { thread.join(); } catch (InterruptedException e) { }
        
        System.out.println("문이 열렸으니 방에 들어갑니다.");
        
    }
}

class MyRoom extends Thread {
    @Override
    public void run() {
        openDoor();
    }
    
    public void openDoor() {
        System.out.println("\t>> 문을 여는데 2초가 걸립니다.");
        try { Thread.sleep(2000); } catch (InterruptedException e) { }
        System.out.println("\t>> 문이 열렸습니다.");
    }
}