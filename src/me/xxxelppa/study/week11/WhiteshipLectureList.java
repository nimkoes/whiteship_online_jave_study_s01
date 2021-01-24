package me.xxxelppa.study.week11;

public enum WhiteshipLectureList {
    THE_JAVA_JAVA_8                                  (55000 , "더 자바, Java8"),
    THE_JAVA_CODE_MANIPULATION                       (49500 , "더 자바, 코드를 조작하는 다양한 방법"),
    THE_JAVA_APPLICATION_TEST                        (66000 , "더 자바, 애플리케이션을 테스트하는 다양한 방법"),
    SPRING_FRAMEWORK_INTRODUCTION                    (0     , "스프링 프레임워크 입문"),
    SPRING_FRAMEWORK_INTRODUCTION_REVISED_EDITION    (0     , "예제로 배우는 스프링 입문(개정판)"),
    SPRING_FRAMEWORK_CORE                            (55000 , "스프링 프레임워크 핵심 기술"),
    SPRING_FRAMEWORK_WEB_MVC                         (110000, "스프링 웹 MVC"),
    SPRING_BOOT                                      (110000, "스프링 부트 개념과 활용"),
    SPRING_BOOT_UPDATED                              (66000 , "스프링 부트 업데이트"),
    SPRING_AND_JPA_BASED_WEB_APPLICATION_DEVELOPMENT (330000, "스프링과 JPA 기반 웹 애플리케이션 개발"),
    SPRING_SECURITY                                  (88000 , "스프링 시큐리티"),
    REST_API                                         (99000 , "스프링 기반 REST API 개발"),
    SPRING_DATA_JPA                                  (88000 , "스프링 데이터 JPA"),
    INTERVIEW_GUIDE_SOFTWARE_DEVELOPMENT_ENGINEER    (220000, "더 개발자, 인터뷰 가이드");
    
    private int amount;
    private String korDesc;
    
    WhiteshipLectureList(int amount) {
        this.amount = amount;
    }
    
    WhiteshipLectureList(int amount, String korDesc) {
        this.amount = amount;
        this.korDesc = korDesc;
    }
    
    public int getAmount() {
        return this.amount;
    }
    
    public String getKorDesc() {
        return this.korDesc;
    }
    
    @Override
    public String toString() {
        return this.amount + " :: " + this.getKorDesc();
    }
}