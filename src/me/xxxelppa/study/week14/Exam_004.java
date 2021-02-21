package me.xxxelppa.study.week14;

public class Exam_004 {
    
    // T 타입 value 를 저장할 수 있는 클래스
    static class MyGenericClass<T> {
        T value;
        
        MyGenericClass(T value) {
            this.value = value;
        }
    
        public T getValue() {
            return value;
        }
    
        public void setValue(T value) {
            this.value = value;
        }
    }
    
    public static void main(String[] args) {
        MyGenericClass<String> mgc_String = new MyGenericClass<>("사과");
        System.out.println(mgc_String.getValue());
    
        mgc_String.setValue("자몽");
        System.out.println(mgc_String.getValue());
    }
}