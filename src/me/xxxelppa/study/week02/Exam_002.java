package me.xxxelppa.study.week02;

public class Exam_002 {
    public static void main(String[] args) {
        System.out.println("===== 정수 리터럴 =====");
        int int_v1 = 0b10;    // 접두문자 0b   -> 2진수
        int int_v2 = 010;     // 접두문자 0    -> 8진수
        int int_v3 = 10;      // 접두문자 없음 -> 10진수
        int int_v4 = 0x10;    // 접두문자 0x   -> 16진수
        long long_v1 = 10L;   // 접미문자 l 또는 L -> long 타입 리터럴

        System.out.println("2진수 정수 리터럴 : " + int_v1);
        System.out.println("8진수 정수 리터럴 : " + int_v2);
        System.out.println("10진수 정수 리터럴 : " + int_v3);
        System.out.println("16진수 정수 리터럴 : " + int_v4);
        System.out.println("long 타입 정수 리터럴 : " + long_v1);
        System.out.println();

        System.out.println("===== 실수 리터럴 =====");
        // 실수 타입 리터럴은 double 타입으로 컴파일 되므로
        // float 타입인 경우 명시적으로 f 또는 F 를 명시해줘야 한다.
        // double 타입도 d나 D를 명시해줘도 되지만, 안해줘도 상관 없다.
        float float_v1 = 1.234F;
        double double_v1 = 1.234;
        double double_v2 = 1.234d;
        double double_v3 = 1234E-3d;

        System.out.println("float 타입 실수 리터럴 : " + float_v1);
        System.out.println("double 타입 실수 리터럴 1 : " + double_v1);
        System.out.println("double 타입 실수 리터럴 2 : " + double_v2);
        System.out.println("double 타입 실수 리터럴 3 : " + double_v3);
        System.out.println();


        System.out.println("===== 문자 리터럴 =====");
        char char_v1 = 'C';
        char char_v2 = '민';
        char char_v3 = '\u1234';    // 백슬러시 u 다음 4자리 16진수 유니코드

        System.out.println("문자 리터럴 1 : " + char_v1);
        System.out.println("문자 리터럴 2 : " + char_v2);
        System.out.println("문자 리터럴 3 : " + char_v3);
        System.out.println();


        System.out.println("===== 부울(논리) 리터럴 =====");
        boolean boolean_v1 = true;
        boolean boolean_v2 = 12 > 34;

        System.out.println("부울(논리) 리터럴 1 : " + boolean_v1);
        System.out.println("부울(논리) 리터럴 2 : " + boolean_v2);
        System.out.println();


        System.out.println("===== 문자열 리터럴 =====");
        String string_v1 = "hello, ws study";
        System.out.println("문자열 리터럴 : " + string_v1);
        System.out.println();
    }
}
