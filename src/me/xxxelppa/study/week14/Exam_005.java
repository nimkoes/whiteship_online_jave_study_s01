package me.xxxelppa.study.week14;

public class Exam_005 {
    static class MyGenericClass<T, R> {
        T value_1;
        R value_2;
        
        public T getValue_1() {
            return value_1;
        }
        
        public void setValue_1(T value_1) {
            this.value_1 = value_1;
        }
    
        public R getValue_2() {
            return value_2;
        }
    
        public void setValue_2(R value_2) {
            this.value_2 = value_2;
        }
    }
    
    public static void main(String[] args) {
        MyGenericClass<String, Integer> mgc = new MyGenericClass<>();
        mgc.setValue_1("사과");
        mgc.setValue_2(1000);
        System.out.println(mgc.getValue_1() + " 한 개 " + mgc.getValue_2() + "원");
    }
}