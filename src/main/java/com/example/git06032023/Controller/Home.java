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




        public String help()
           {
              return "helping.....";
           }


        @GetMapping("/pølser")
        public String toLayanEgg() {
            return "laver pølser";

        }

}



