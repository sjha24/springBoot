package saurav.getJokes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public class JokesController {
    static ArrayList<String>jokesList = new ArrayList<>();
    @PostMapping(value = "/jokes")
    public  String saveJokes(@RequestBody String jokes){

        jokesList.add(jokes);
    }
    @GetMapping(value = "/jokes")
    public String getRandomJokes(){

        jokesList.add("My wife told me to stop impersonating a flamingo. I had to put my foot down.");
        jokesList.add("Saurav jha");
        int randomNum = 0+(int)Math.random() * ((jokesList.size()-1-0)+1);
        return jokesList.get(randomNum);
    }
}
