package com.example.midtermQuestion3.controller;


import com.example.midtermQuestion3.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/joke")
class Controller {


    @Autowired
    private Service joke;


    @GetMapping
    public String getJokes(){
        return (joke.getJokes());
    }
    @RequestMapping("/")
    public String myController(@ModelAttribute("joke") Model model){
        return  "index.html";
    }
}
