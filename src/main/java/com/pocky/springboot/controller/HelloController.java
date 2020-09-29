package com.pocky.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author pocky
 * @date 2020/09/25/0025
 */

@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model){
        model.addAttribute("msg","你好");
        return "success";
    }
}
