package com.gq.hph.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemplateController {

    @GetMapping(value = "/sample")
    public String sample() {
        // System.out.println("sample is succeslly!");
        return "This is test!!!!! SampleController is succeslly!";
    }
}
