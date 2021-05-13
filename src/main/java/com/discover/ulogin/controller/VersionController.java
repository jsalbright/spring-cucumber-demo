package com.discover.ulogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @GetMapping("/version")
    public String getVersion() {
        return "1.0";
    }

    @GetMapping("/version_fixed")
    public String getVersionFixed(){
        return "1.0\n";
    }
}