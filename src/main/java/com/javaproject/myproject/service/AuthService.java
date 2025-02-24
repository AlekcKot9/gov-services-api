package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class AuthService {

    private AuthService() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean logInUser(AuthRequest authRequest) {
        if (authRequest.getPassword().equals("password")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean signUpUser(AuthRequest authRequest) {
        if (authRequest.getPassword().isEmpty() || authRequest.getUsername().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
