package com.example.kgisl.microcollege.superAdmin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.kgisl.microcollege.superAdmin.Model.TrendingFact;

public interface TrendingFactRepository extends MongoRepository<TrendingFact, String> {

}