package com.xpy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController2 {

    @GetMapping("/books")
    public String list(){
        return "books";
    }
}
