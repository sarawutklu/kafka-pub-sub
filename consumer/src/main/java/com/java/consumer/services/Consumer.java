package com.java.consumer.services;

import java.io.IOException;
import com.java.consumer.models.User;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "hello", groupId = "demo-group-id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }

    @KafkaListener(topics = "create-user", groupId = "demo-group-id")
    public void consume(User user) throws IOException {
        logger.info(String.format("#### ->topics: create-user Consumed message -> %s", user));
    }

//     @KafkaListener(topics = "topic", groupId = "myGroupId", properties = {"spring.json.value.default.type=com.something.model.TransactionEventPayload"})
//  public void consumeTransactionEvent(@Payload TransactionEventPayload payload,
//                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Integer key,
//                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
//                        @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long timestamp) {
}