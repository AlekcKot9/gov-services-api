package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class UserService {

    static final String str = "1222p";

    public static String getBalance() {
        return str;
    }

    public static String changePassword(UpdatePasswordRequest updatePasswordRequest) {
        if(updatePasswordRequest.getOldPassword().equals("password"))
            return "YES UPDATED";
        else return "NO UPDATED";
    }
}
