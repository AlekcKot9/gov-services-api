package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class AuthService {

    private AuthService() {
        throw new IllegalStateException("Utility class");
    }

    public static String logInUser(AuthRequest authRequest) {
        if (authRequest.getPassword().equals("password")) {
            return "YES LOGIN";
        } else {
            return "NO LOGIN";
        }
    }

    public static String signUpUser(AuthRequest authRequest) {
        if (authRequest.getPassword().equals("password")) {
            return "YES SIGN UP";
        } else {
            return "NO SIGN UP";
        }
    }
}
