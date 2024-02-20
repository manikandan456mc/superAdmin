package com.example.kgisl.microcollege.superAdmin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.kgisl.microcollege.superAdmin.Model.Drive;

public interface DriveRepository extends MongoRepository<Drive, String> {

}
