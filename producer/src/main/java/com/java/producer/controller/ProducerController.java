package com.java.producer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {

   @PostMapping("/{message}")
   public String postMethodName(@RequestBody String message) {
       return String.format("push message %s success!", message);
   }
   
    
}
