package com.sparta.springauth.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") //Email정규식
    @Email
    @NotBlank
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}