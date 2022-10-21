package com.cxs.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    //定义了一个url
    @RequestMapping("/firstController")
    public String hello(Model model){
        model.addAttribute("msg","我的第一个controller");
        return "/jsp/first";
    }
}
