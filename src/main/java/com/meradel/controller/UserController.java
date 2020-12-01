package com.meradel.controller;

import com.meradel.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping({"/create"})
    public String createUser(Model model){

        // model will send empty object to the view
        model.addAttribute("user", new UserDTO());
        /*
        this user object can be use in view , under form
        th:action="@{/user/creae}" ==> will pointing to displayed page, cause we want see new generated user in the same page
        method="post"
        th:object="${user}"
         */



        return "/user/create";
    }


}
