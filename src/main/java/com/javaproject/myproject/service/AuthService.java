package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class AuthService {

    private AuthService() {
        throw new IllegalStateException("Utility class");
    }

    public static AnsString logInUser(AuthRequest authRequest) {
        if (authRequest.getPassword().equals("password")) {
            return new AnsString("YES LOGIN");
        } else {
            return new AnsString("NO LOGIN");
        }
    }



    public static AnsString signUpUser(AuthRequest authRequest) {
        if (authRequest.getPassword().equals("password")) {
            return new AnsString("YES SIGN UP");
        } else {
            return new AnsString("NO SIGN UP");
        }
    }
}
