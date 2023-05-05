package com.example.Urls.Application;

import com.example.Urls.Domain.Url;
import com.example.Urls.Domain.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
    @Autowired
    private UrlRepository urlRepository;

    public Url save(Url url) {
        return urlRepository.save(url);
    }
}
