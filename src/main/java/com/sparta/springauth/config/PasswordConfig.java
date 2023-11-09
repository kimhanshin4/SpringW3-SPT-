package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//2.해당 Class 위에 Configuration Annotation 설정
@Configuration //Spring 서버가 뜨면 Spring IoC Container에 Bean으로 저장됨
public class PasswordConfig {

    @Bean
    public PasswordEncoder passwordEncoder() { //1.Bean으로 등록하고자 하는 객체를 반환하는 메서드 작성
        return new BCryptPasswordEncoder(); //비밀번호를 암호화해주는 Hash함수
    }
}