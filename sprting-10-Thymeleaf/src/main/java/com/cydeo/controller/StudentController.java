package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

   // @RequestMapping("/register", method = RequestMethod.GET)//localhost:8080/student/register
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

    //@RequestMapping("/welcome")//localhost:8080/student/register
    @PostMapping("/welcome")
    public String welcome(){


        return "student/welcome";
    }
}
