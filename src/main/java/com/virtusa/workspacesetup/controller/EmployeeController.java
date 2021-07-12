package com.virtusa.workspacesetup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/welcome")
    public String greetingEmployee(@RequestParam String name){
        return "Hello " + name;
    }


}
