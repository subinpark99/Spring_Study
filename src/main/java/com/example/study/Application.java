package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // 스프링 부트의 자동 설정, 항상 최상단에 위치해야 함
public class Application {  // 프로젝트의 메인 class

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);  // 내장 WAS 실행
    }
}