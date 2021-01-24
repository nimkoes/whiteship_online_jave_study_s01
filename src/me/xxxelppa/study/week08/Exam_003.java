package me.xxxelppa.study.week08;

interface MyInterface_01 {
    void mustBeInvoked();
}

public class Exam_003 {
    public static void main(String[] args) {
        
        MyTestClass_01 mtc_01 = new MyTestClass_01();
        MyTestClass_02 mtc_02 = new MyTestClass_02();
        
        /*
         * mtc_01 과 mtc_02 변수는 각각 특정 클래스의 객체를 담고 있다.
         * 이 두 클래스는 모두 MyInterface_01 이라는 인터페이스를 상속받았으므로
         * MyInterface_01 에 정의한 추상 메소드인 mustBeInvoked() 가 무조건 구현 되어있음을 알 수 있다.
         *
         * 그리고 정말 중요한 한가지가 더 있는데,
         * 두 클래스가 같은 인터페이스를 상속 받았기 때문에 다음과 같이 배열로 관리할 수 있다.
         */
        
        // 인터페이스 타입으로 묶어서 관리할 수 있다 !!!
        MyInterface_01[] mi_01 = {
                new MyTestClass_01()
                , new MyTestClass_02()
        };
        
        // 같은 인터페이스를 구현하고 있기 때문에
        // mustBeInvoked 메소드가 있음을 확신하고 사용할 수 있다.
        for (MyInterface_01 mi : mi_01) {
            mi.mustBeInvoked();
        }
    }
}

/*
 * 인터페이스를 상속 받았는데,
 * 추상 메소드를 구현하지 않으면 (즉, 오버라이딩 하지 않으면)
 * 다음과 같은 컴파일 오류를 발생한다.
 *
 * Class 'MyTestClass_01' must either be declared abstract or implement abstract method 'mustBeInvoked()' in 'MyInterface_01'
 */
class MyTestClass_01 implements MyInterface_01 {
    
    /*
     * @Override 어노테이션을 생략해도 상관 없지만
     * 오버라이딩 한 메소드임을 컴파일러에게 알려주고
     * 사용자 입장에서도 한 눈에 오버라이딩 한 메소드임을 알려주기 위해
     * 굳이 사용하는 것을 권장한다.
     */
    @Override
    public void mustBeInvoked() {
        System.out.println("DO SOMETHING!");
    }
}

class MyTestClass_02 implements MyInterface_01 {
    @Override
    public void mustBeInvoked() {
        System.out.println("DOBBY IS FR22");
    }
}