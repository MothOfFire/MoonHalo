package com.cxs.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class ThirdController {

    @GetMapping("/thirdController")
    public String hello(Model model){
        model.addAttribute("msg","通过类RequestMapping访问方法");
        return "/jsp/first";
    }
}
