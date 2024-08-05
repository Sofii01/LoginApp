package com.login.LoginApplication.request;

import com.login.LoginApplication.enums.Role;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.swing.*;

@Data
@RequiredArgsConstructor
public class RegisterRequest {
    private String username;
    private String password;
    private String lastname;
    private String email;
    private Role role;
}
