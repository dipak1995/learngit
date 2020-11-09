package com.ptt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class testController {

    @RequestMapping("/a")
    public String test(Model model){

        model.addAttribute("username","向左向右");

        model.addAttribute("users", Arrays.asList("111","222","333"));
        return "test";
    }


    @RequestMapping("/t2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","<h1>Hello</h1>");
        map.put("users", Arrays.asList("qinjiang","kuangshen"));
        //classpath:/templates/test.html
        return "test";
    }
}
