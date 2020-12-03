package com.wym.controller;

import com.wym.server.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private StudentsService studentsService;
    @RequestMapping("/say")
    public String say(){

        return "say string boot";

    }

    @RequestMapping("/getName")
    public String getName(){

        System.out.println("springboot---");

        return studentsService.getName();
    }
}
