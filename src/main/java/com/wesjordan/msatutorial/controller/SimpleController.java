package com.wesjordan.msatutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

    @RequestMapping("/")
    public String hellowWorld(){
        return "hello";
    }
}
