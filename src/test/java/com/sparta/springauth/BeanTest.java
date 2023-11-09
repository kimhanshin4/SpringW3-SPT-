package com.sparta.springauth;

import com.sparta.springauth.food.*;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;

@SpringBootTest //Bean DI를 위한 Annotation
public class BeanTest {

    @Autowired
    @Qualifier("pizzang")
    Food food;

    @Test
    @DisplayName("배고팡~")
    void test1() {
        food.eat();
    }
}

//등록된 Bean 이름 명시로 문제 해결 테스트
//    @Autowired
//    Food pizza;
//
//    @Autowired
//    Food chicken;
//
//    @Test
//    @DisplayName("배고팡~")
//    void test1(){
//        pizza.eat();
//        chicken.eat();
//    }
//
//}
