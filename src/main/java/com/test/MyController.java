package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/1.
 */
@Controller
public class MyController {

    @RequestMapping("/hi")
    public String SayHi(Model model) {
        model.addAttribute("message", "Hello Spring MVC!");
        return "sayhi";
    }
}
