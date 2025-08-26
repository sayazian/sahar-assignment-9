package com.coderscampus.recipes.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @GetMapping("")
    public String sayHi(){
        System.out.println("Hi console!");
        return "Hi web!";
    }


}
