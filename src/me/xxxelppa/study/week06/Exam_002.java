package me.xxxelppa.study.week06;

public class Exam_002 {
    public static void main(String[] args) {
        MyParent mp = new MyChild();
    
        MyParent[] arrMP = new MyParent[10];
        for(int i = 0; i < arrMP.length; ++i) {
            if(i % 2 == 0) arrMP[i] = new MyChild();  // 짝수번째 요소에는 자식 객체
            else arrMP[i] = new MyParent();           // 홀수번째 요소에는 부모 객체
        }
    }
}

class MyParent { }
class MyChild extends MyParent { }