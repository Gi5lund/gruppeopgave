package com.example.git06032023.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String index() {
        return "Hello World, Der lugter lidt af ost, kom nu Morten";
        }
        @GetMapping("real")
        public String getReal(){
        return "for realsies";
        }





        @GetMapping
        public String hurra(){
            return "Hallooooo";
        }

        @GetMapping("Its a Witch")
        public String doesItQuack(){
        return "walks like a duck";
        }
    // Jeg tror måske det virker ellers bliver jeg sur!!!!!

        @GetMapping("Auxilio")
        public String help()
           {
              return "helping.....";
           }


        @GetMapping("/pølser")
        public String toLayanEgg() {
            return "laver pølser";

        }

        //Nu skal i bare se løjer!

        @GetMapping("/hejhej")
        public String toFork() {
            return "Fork Fork";
    }
}
// bla bæa akdflaføæafk



