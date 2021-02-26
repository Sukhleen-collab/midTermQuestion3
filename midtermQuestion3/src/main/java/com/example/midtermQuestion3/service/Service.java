package com.example.midtermQuestion3.service;

import com.example.midtermQuestion3.RandomJokes;
import org.springframework.beans.factory.annotation.Autowired;



@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private RandomJokes randomJokes;
    public String getJokes(){
       return  randomJokes.getRandomJokes();
    }
}
