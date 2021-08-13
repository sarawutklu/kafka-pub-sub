package com.java.producer.controller;

import com.java.producer.models.User;
import com.java.producer.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {

    private final Producer producer;

    @Autowired
    ProducerController(Producer producer) {
        this.producer = producer;
    }
    

   @PostMapping("/{message}")
   public String postMethodName(@RequestBody String message) {
        this.producer.sendMessage(message);
        return String.format("push message %s success!", message);
   }

   @PostMapping("/user")
   public String postMethodName(@RequestBody User user) {
        this.producer.sendMessageToCreateUser(user);
        return String.format("push message %s success!", user);
   }
   
    
}
