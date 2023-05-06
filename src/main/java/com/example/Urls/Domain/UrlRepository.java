package com.example.Urls.Domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends MongoRepository<Url, String> {
   @Query("{'userId': ?0}")
    List<Url> findUrlByUserId(String userId);
}
