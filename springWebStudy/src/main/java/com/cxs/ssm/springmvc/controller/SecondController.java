package com.cxs.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
    @RequestMapping("/secondControllerAction1")
    public String  action1(Model model){
        model.addAttribute("msg","SecondController的action1方法");
        return "/jsp/first";
    }
    @RequestMapping("/secondControllerAction2")
    public String action2(Model model){
        model.addAttribute("msg","SecondController的action2方法");
        return "/jsp/first";
    }
}
