package com.sparta.springauth.food;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pizzang")
public class Pizza implements Food {

    @Override
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}