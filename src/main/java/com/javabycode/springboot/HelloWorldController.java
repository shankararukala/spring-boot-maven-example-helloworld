package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        
        String message="You just create Spring Boot Example successfully";
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        System.out.println("Shankar Arukala");
<<<<<<< HEAD
        
        System.out.println("MGU, NLG");
=======
        //System.out.println("This is my first Project");
        System.out.println("MGU , NLG);
>>>>>>> 1defff654f2ba16fc602aff4432c2e537c38ddf7
        return "hello";
    }
}
