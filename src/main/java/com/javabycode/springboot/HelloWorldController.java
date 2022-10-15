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
        System.out.println("This is my first Project");
        System.out.println("MGU, NLG");
        System.out.println("Nagaraju");
        System.out.println("Shankar");
        System.out.println("ARUKALA");
        System.out.println("AS");

        System.out.println("JL");
        System.out.println("Arukala Shiva");

        System.out.println("Mukesh Arukala");
        
        System.out.println("Arukala Shankar");
        return "hello";
    }
    public void update(){
        System.out.println(update......);
    }
 
}
