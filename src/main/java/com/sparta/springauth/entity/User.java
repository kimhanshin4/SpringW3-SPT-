package com.sparta.springauth.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)//고유한 값
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)//고유한 값
    private String email;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING) //USER=>문자열 그대로 DB에 저장
    private UserRoleEnum role;

    public User(String username, String password, String email, UserRoleEnum role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}