package com.example.Urls.Infrastructure;


import com.example.Urls.Domain.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Url> kafkaTemplate;

    public void send(String topic, Url message) {
        kafkaTemplate.send(topic, message);
    }
}