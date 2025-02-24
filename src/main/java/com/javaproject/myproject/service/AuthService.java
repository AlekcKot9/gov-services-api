package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class AuthService {

    private AuthService() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean logInUser(AuthRequest authRequest) {
        return authRequest.getPassword().equals("password"));
    }

    public static boolean signUpUser(AuthRequest authRequest) {
        return authRequest.getPassword().isEmpty() || authRequest.getUsername().isEmpty();
    }
}
