package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication이 있는 위치부터 설정을 읽기 때문에 이 클래스는 항상 프로젝트 최상단에 위치
@SpringBootApplication // 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동 설정
public class Application {
    public static void main(String[] args) {
        // 내장 WAS 실행 > 서버에 톰캣 설치할 필요 없음, 스프링 부트로 만들어진 Jar 파일 실행
        SpringApplication.run(Application.class, args);
    }
}
