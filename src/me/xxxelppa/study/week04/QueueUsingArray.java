package me.xxxelppa.study.week04;

public class QueueUsingArray {
    
    private final int EXTEND_SIZE = 10;
    private int[] myQueue;
    private int headPos;
    private int tailPos;
    
    public QueueUsingArray() {
        this.myQueue = new int[EXTEND_SIZE];
        this.headPos = 0;
        this.tailPos = 0;
    }
    
    /*
     * pop 실행 중 head 위치가 EXTEND_SIZE 에 다다르면 호출
     * 배열의 0번째부터 값을 다시 채우고, headPos 와 tailPos 다시 할당
     */
    public void resetQueue() {
        for(int i = headPos, j = 0; i <= tailPos; ) myQueue[j++] = myQueue[i++];
        tailPos -= headPos;
        headPos = 0;
    }
    
    /*
     * Queue 의 크기를 EXTEND_SIZE 만큼 확장
     */
    public int[] extendQueue() {
        int[] newQueue = new int[myQueue.length + EXTEND_SIZE];
        for(int i = 0; i < myQueue.length; ++i) newQueue[i] = myQueue[i];
        return newQueue;
    }
    
    // 배열의 마지막 위치에 값 추가
    public void push(int data) {
        if(tailPos + 1 == myQueue.length) myQueue = extendQueue();
        this.myQueue[tailPos++] = data;
    }
    
    /*
     * 반환할 데이터가 없는 경우 -1 반환
     */
    public int pop() {
        if(headPos == tailPos) return -1;
        if(headPos > EXTEND_SIZE) resetQueue();
        return myQueue[headPos++];
    }
    
    // Queue 에 들어있는 데이터의 수를 반환
    public int size() {
        return this.tailPos - this.headPos;
    }
}