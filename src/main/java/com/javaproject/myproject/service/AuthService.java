package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class AuthService {

    public static String concatenate(AuthRequest authRequest) {
        return authRequest.getUsername();
    }

    public static String logInUser(AuthRequest authRequest) {
        if(authRequest.getPassword()=="password")
            return "YES LOGIN";
        else
            return "NO LOGIN";
    }

    public static String signUpUser(AuthRequest authRequest) {
        if(authRequest.getPassword()=="password")
            return "YES SIGN UP";
        else
            return "NO SIGN UP";
    }
}
