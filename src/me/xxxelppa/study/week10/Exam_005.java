package me.xxxelppa.study.week10;

public class Exam_005 {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount();
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myAccount.withdrawal(1000);
            }
        };
        
        Thread myThread_1 = new Thread(runnable);
        Thread myThread_2 = new Thread(runnable);
        Thread myThread_3 = new Thread(runnable);
        
        myThread_1.start();
        myThread_2.start();
        myThread_3.start();
    }
}

class MyAccount {
    private int myMoney = 1000;
    
    public int withdrawal(int money) {
        System.out.println(">>> 출금 시작");
        
        int returnMoney = money;
        
        synchronized(this) { // 동기화 하려는 공유 객체를 넣어준다. this를 넣으면 자기 자신이 공유 객체임을 뜻한다.
            // 찾으려는 금액보다 잔고가 많은 경우에만 출금
            if(this.myMoney < money) {
                System.out.println(" :: 잔액이 부족합니다.");
                System.out.println(">>> 출금 종료");
                return 0;
            }
            
            // 인출 하는데 1초가 걸린다고 가정
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println(" :: 찾으신 금액 : " + money);
            this.myMoney -= money;
        }
        
        
        System.out.println(">>> 출금 종료");
        return returnMoney;
    }
}