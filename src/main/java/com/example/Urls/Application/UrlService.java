package com.example.Urls.Application;

import com.example.Urls.Domain.Url;
import com.example.Urls.Domain.UrlRepository;
import com.example.Urls.Infrastructure.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {
    @Autowired
    private UrlRepository urlRepository;

    @Autowired
    private KafkaProducer kafkaProducer;

    public List<Url> findUrlsByUserId(String userId) {
        return urlRepository.findUrlByUserId(userId);
    }

    public Url save(Url url) {
        Url urlCreated = urlRepository.save(url);

        kafkaProducer.send("test", urlCreated);

        return urlCreated;
    }

}
