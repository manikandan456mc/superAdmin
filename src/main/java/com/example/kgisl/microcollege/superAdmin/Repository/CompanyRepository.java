package com.example.kgisl.microcollege.superAdmin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.kgisl.microcollege.superAdmin.Model.Company;

public interface CompanyRepository extends MongoRepository<Company, String> {

}