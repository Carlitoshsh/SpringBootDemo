package com.demo.p80.controller;

import com.demo.p80.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("hello")
    public String getGello() {
        personaService.register("Carlos");
        return "hello world!";
    }
}
