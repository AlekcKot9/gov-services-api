package com.javaproject.myproject.controller;

import com.javaproject.myproject.model.*;
import com.javaproject.myproject.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @PostMapping("/login")
    public AnsString logInUser(@RequestBody AuthRequest request) {
        return AuthService.logInUser(request);
    }

    @PostMapping("/signup")
    public AnsString signUpUser(@RequestBody AuthRequest request) {
        return AuthService.signUpUser(request);
    }
}
//для создания аккаунта и для авторизации