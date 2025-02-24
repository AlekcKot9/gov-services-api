package com.javaproject.myproject.service;

import com.javaproject.myproject.model.*;

public class UserService {

    static final String BEST_STR = "1222p";

    private UserService() {
        throw new AssertionError("No instance for you!");
    }

    public static AnsString getBalance() {
        return new AnsString(BEST_STR);
    }

    public static AnsString changePassword(UpdatePasswordRequest updatePasswordRequest) {
        if (updatePasswordRequest.getOldPassword().equals("password")) {
            return new AnsString("YES UPDATED");
        } else {
            return new AnsString("NO UPDATED");
        }
    }
}
