package saurav.getRandomJokes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JokesController {
       static ArrayList<String>Jokes = new ArrayList<>();
       @PostMapping(value = "/jokes")
       public String getJokes(@RequestBody String jokes){
           Jokes.add(jokes);
           return "Jokes Saved which you type";
       }
    @GetMapping(value = "/jokes")
    public String getJokes(){
        Jokes.add("Why did the chicken cross the playground?\n" +
                "To get to the other slide!");
        Jokes.add("Why are peppers the best at archery?\n" +
                "Because they habanero!");
        Jokes.add("What did the duck say after she bought chapstick?\n" +
                "Put it on my bill!");
        Jokes.add("Why did an old man fall in a well?\n" +
                "Because he couldn’t see that well!");
        Jokes.add("What do you call a fake noodle?\n" +
                "An impasta!");
        Jokes.add("How do you tell the difference between a bull and a cow?\n" +
                "It is either one or the udder!");
        Jokes.add("What’s red and smells like blue paint?\n" +
                "Red paint!");

        int randomeNum = 0+(int)(Math.random() * ((Jokes.size()-1-0) * 1));
        return Jokes.get(randomeNum);
    }
}
