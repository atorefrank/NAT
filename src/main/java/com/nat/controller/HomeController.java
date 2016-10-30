package com.nat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by francisatore on 10/29/16.
 */

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/")
    public String home(){

        return "home";
    }
}
