package me.xxxelppa.study.week11;

import java.util.EnumSet;

public class Exam_007 {
    public static void main(String[] args) {
        EnumSet<MyEnum> enumSet = EnumSet.allOf(MyEnum.class);
    
        System.out.println("================= 전체 출력 =================");
        System.out.println(enumSet);
        System.out.println();
        
        EnumSet newEnumSet = EnumSet.of(MyEnum.MON, MyEnum.TUE, MyEnum.WED, MyEnum.THU, MyEnum.FRI);
        
        System.out.println("============= 특정 상수만 출력 ==============");
        System.out.println(newEnumSet);
        System.out.println();
    
        System.out.println("========== 특정 상수 제외하고 출력 ==========");
        System.out.println(EnumSet.complementOf(newEnumSet));
        System.out.println();
        
        System.out.println("================= 범위 출력 =================");
        System.out.println(EnumSet.range(MyEnum.WED, MyEnum.FRI));
        System.out.println();
        
    }
}

enum MyEnum {
    SUN, MON, TUE, WED, THU, FRI, SAT
}