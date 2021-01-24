package me.xxxelppa.study.week11;

public class Exam_006 {
    public static void main(String[] args) {
        WhiteshipLectureList myLec_1 = WhiteshipLectureList.SPRING_FRAMEWORK_CORE;
        WhiteshipLectureList myLec_2 = WhiteshipLectureList.SPRING_DATA_JPA;
    
        System.out.println("myLec_1 ordinal :: " + myLec_1.ordinal());
        System.out.println("myLec_2 ordinal :: " + myLec_2.ordinal());
        System.out.println();
        
        System.out.println("diff ordinal :: " + (myLec_1.ordinal() - myLec_2.ordinal()));
        System.out.println("compareTo :: " + myLec_1.compareTo(myLec_2));
        System.out.println();
        
        System.out.println(myLec_1.name());
        System.out.println(myLec_1.toString());
    }
}