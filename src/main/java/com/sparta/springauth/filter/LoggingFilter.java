package com.sparta.springauth.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j(topic = "LoggingFilter") //지정한 topic 내용으로 log가 찍힘!
//@Component //필터가 Spring Sequrity에 영향을 주지 않도록
@Order(1) //Filter에 순서를 지정할 수 있다. // 인증,인가 Filter보다 먼저 시작되게
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        // 전처리
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String url = httpServletRequest.getRequestURI();
        log.info(url); //@Slf4j + log.info(url) => log를 찍을 수 있음. //warn, error등 다양함

        chain.doFilter(request, response); // 다음 Filter 로 이동

        // 후처리
        log.info("비즈니스 로직 완료");
    }
}