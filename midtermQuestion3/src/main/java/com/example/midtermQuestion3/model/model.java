package com.example.midtermQuestion3.model;

import com.example.midtermQuestion3.RandomJokes;
import org.springframework.beans.factory.annotation.Autowired;

public class model {

    @Autowired
    private RandomJokes randomJokes;
    private String Joke;

    public model(){
        Joke = randomJokes.getRandomJokes();
    }

    public String getJoke() {
        return Joke;
    }

    public void setJoke(String joke) {
        Joke = joke;
    }

    @Override
    public String toString() {
        return "model{" +
                "Joke='" + Joke + '\'' +
                '}';
    }
}
