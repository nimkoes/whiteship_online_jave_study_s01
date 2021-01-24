package me.xxxelppa.study.week11;

public class Exam_001 {
    public static void main(String[] args) {
        
        WhiteshipLectureList list = WhiteshipLectureList.SPRING_FRAMEWORK_CORE;
        int amount = 0;
        
        switch (list) {
            case THE_JAVA_JAVA_8                                  : amount = 55000;  break;
            case THE_JAVA_CODE_MANIPULATION                       : amount = 49500;  break;
            case THE_JAVA_APPLICATION_TEST                        : amount = 66000;  break;
            case SPRING_FRAMEWORK_INTRODUCTION                    : amount = 0;      break;
            case SPRING_FRAMEWORK_INTRODUCTION_REVISED_EDITION    : amount = 0;      break;
            case SPRING_FRAMEWORK_CORE                            : amount = 55000;  break;
            case SPRING_FRAMEWORK_WEB_MVC                         : amount = 110000; break;
            case SPRING_BOOT                                      : amount = 110000; break;
            case SPRING_BOOT_UPDATED                              : amount = 66000;  break;
            case SPRING_AND_JPA_BASED_WEB_APPLICATION_DEVELOPMENT : amount = 330000; break;
            case SPRING_SECURITY                                  : amount = 88000;  break;
            case REST_API                                         : amount = 99000;  break;
            case SPRING_DATA_JPA                                  : amount = 88000;  break;
            case INTERVIEW_GUIDE_SOFTWARE_DEVELOPMENT_ENGINEER    : amount = 220000; break;
        }
    
        System.out.println(list + " 수강료는 " + amount + "(원) 입니다.");
    }
}