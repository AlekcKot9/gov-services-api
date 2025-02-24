package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class UserService {

    static final String BEST_STR = "1222p";

    private UserService(){
        throw new AssertionError("No instance for you!");
    }

    public static String getBalance() {
        return str;
    }

    public static String changePassword(UpdatePasswordRequest updatePasswordRequest) {
        if(updatePasswordRequest.getOldPassword().equals("password"))
            return "YES UPDATED";
        else return "NO UPDATED";
    }
}
