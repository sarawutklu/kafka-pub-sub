package com.java.producer.services;

import com.java.producer.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "hello";
    private static final String TOPIC_CREATE_USER = "create-user";

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }

    public void sendMessageToCreateUser(User user) {
        logger.info(String.format("#### -> topics: create-user  Producing message -> user name %s", user.getName()));
        this.kafkaTemplate.send(TOPIC_CREATE_USER, user);
    }
}