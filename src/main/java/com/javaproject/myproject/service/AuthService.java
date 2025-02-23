package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class AuthService {

    public static String concatenate(AuthRequest authRequest) {
        return authRequest.getUsername();
    }

    public static String logInUser(AuthRequest authRequest) {
        return authRequest.getUsername() + " log in";
    }

    public static String signUpUser(AuthRequest authRequest) {
        return authRequest.getUsername() + " sign up";
    }
}
