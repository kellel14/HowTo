package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping
    public String pageZero(){
        return "/";
    }
    @RequestMapping
    public String mainPage(){
        return "/index1";
    }

    @RequestMapping
    public String pageTwo(){
        return "/index2";
    }

    @RequestMapping
    public String pageThree(){
        return "/index3";
    }

}
