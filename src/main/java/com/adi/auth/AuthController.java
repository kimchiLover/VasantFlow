package com.adi.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AuthController
{
    @RequestMapping(method = RequestMethod.GET)
    public String printStatus(ModelMap model)
    {
        model.addAttribute("status", "SUCCESS!");
        return "postLoggedIn";
    }
}