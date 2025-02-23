package com.javaproject.myproject.controller;

import com.javaproject.myproject.model.*;
import com.javaproject.myproject.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getBalance")
    public String getBalance() {
        return UserService.getBalance();
    }

    @PostMapping("/updatePassword")
    public String changePassword(@RequestBody UpdatePasswordRequest updatePasswordRequest) {
        return UserService.changePassword(updatePasswordRequest);
    }
}
//для работы с профилем получение ID или изменения пароля или имени
