package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class AuthService {

    public static String logInUser(AuthRequest authRequest) {
        return "user logged in";
    }

    public static String signUpUser(AuthRequest authRequest) {
        return "user signed up";
    }
}
