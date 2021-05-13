package com.discover.ulogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String getVersion() {
        return "1.0";
    }

    @GetMapping("/ac_main")
    public String getAccountCenterMain(){
        return "1.0\n";
    }
}