package com.meradel.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
controllers can be annotated with the @Controller annotation. This is simply a specialization of
 the @Component class and allows implementation classes to be autodetected through the classpath
 scanning.
 */

@Controller
public class LoginController {

    @RequestMapping
    public String login(){
        return "login";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}
