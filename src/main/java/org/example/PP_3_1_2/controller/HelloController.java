package org.example.PP_3_1_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(value = "/")
    public String printHello() {
        return "startPage";
    }
}

