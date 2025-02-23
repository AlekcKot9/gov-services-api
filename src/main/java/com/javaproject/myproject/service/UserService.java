package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class UserService {

    public static String getBalance() {
        return "1244p";
    }

    public static String changePassword(UpdatePasswordRequest updatePasswordRequest) {
        return updatePasswordRequest.getOldPassword() + " updated";
    }
}
