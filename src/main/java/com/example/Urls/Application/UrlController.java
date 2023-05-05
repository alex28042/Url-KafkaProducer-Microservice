package com.example.Urls.Application;

import com.example.Urls.Domain.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/urls")
public class UrlController {
    @Autowired
    private UrlService urlService;

    @PostMapping
    public Url save(@RequestBody Url url) {
        return urlService.save(url);
    }
}
