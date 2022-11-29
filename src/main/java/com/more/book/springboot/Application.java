package com.more.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

    /**
     * 이클래스는 앞으로 메인클래스가 됨
     * @SpringBootApplication 어노테이션으로 인해 스프링부트와 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정됨.
     * 특히나 @SpringBootApplication 이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트의 최상단에 위치해야함
     * main 메소드에서 실행하는 SpringApplication.run 으로 인해 내장 WAS(Web Application Server) 를 실행함.
     * 내장 WAS -> 어플리케이션 실행 시 내부에서 WAS 를 실행하는 것 >> 서버에 톰캣설치필요 X 부트로만들어진 Jar 파일로 실행하면 됨
     * 내장 WAS 를 권하는 이유 : 언제 어디서나 같은 환경에서 스프링 부트를 배포 할수있기때문
     *
     */

