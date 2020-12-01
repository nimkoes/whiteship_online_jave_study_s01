package me.xxxelppa.study.week04;

class MyStack {
    int[] myStack;
    int stackSize;
    int dataCount;
    
    public MyStack(int data) {
        this.stackSize = 10;
        this.dataCount = 1;
        this.myStack = new int[stackSize];
        
        this.myStack[0] = data;
    }
    
    public void push(int data) {
        // 스택 크기를 초과할 경우 10씩 늘려준다.
        if(this.stackSize == this.dataCount + 1) {
            int[] newStack = new int[stackSize + 10];
            for (int i = 0; i < stackSize; ++i) newStack[i] = this.myStack[i];
            stackSize += 10;
            this.myStack = newStack;
        }
        
        this.myStack[this.dataCount++] = data;
    }
    
    public int pop() {
        if (this.dataCount == 0) {
            System.out.println("더 이상 데이터가 없습니다");
            return -1;
        }
        return myStack[--this.dataCount];
    }
    
    public void print() {
        for (int i = 0; i < this.dataCount; ++i) {
            System.out.println(i + " :: " + myStack[i]);
        }
    }
}