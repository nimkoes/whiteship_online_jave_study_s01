package me.xxxelppa.study.week15;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

public class Exam_006 {
    public static void main(String[] args) {
        
        // int 타입 두 개를 받아 int 타입을 반환하는 표준 api 사용
        IntBinaryOperator op;
        
        // static method 참조
        op = (num_01, num_02) -> MyReference.add_static(num_01, num_02);
        System.out.println(op.applyAsInt(10, 20));
    
        op = MyReference::add_static;
        System.out.println(op.applyAsInt(20, 30));
        
        
        // instance method 잠조
        MyReference mr = new MyReference();
        
        op = (num_01, num_02) -> mr.add_instance(num_01, num_02);
        System.out.println(op.applyAsInt(30, 40));
        
        op = mr::add_instance;
        System.out.println(op.applyAsInt(40, 50));
        
        // 람다식의 매개변수로 접근 가능한 메소드 참조
        //
        // 만약 (x, y) -> x.instanceMethod(y) 인 경우가 있는데
        // 이런 경우 사용할 수 있는 방법은 아래와 같다.
        //
        // 아래 코드는 x 문자열에 y 문자열이 포함되어 있는지 결과를 반환하는 예제이다.
        // String 클래스의 contains 를 사용 한다.
        //
        // 이 경우 static method 참조와 형태가 매우 유사해 보이지만
        // x의 타입에 속하는 클래스 다음에 :: 연산자를 사용해서 메소드 참조를 한다.
        BiFunction<String, String, Boolean> myBiFunction;
        myBiFunction = (x, y) -> x.contains(y);
        System.out.println(myBiFunction.apply("java study", "java"));
        
        myBiFunction = String::contains;
        System.out.println(myBiFunction.apply("java online study", "python"));
    }
}

class MyReference {
    // static method
    public static int add_static(int num_1, int num_2) {
        return num_1 + num_2;
    }
    
    // instance method
    public int add_instance(int num_1, int num_2) {
        return num_1 + num_2;
    }
}