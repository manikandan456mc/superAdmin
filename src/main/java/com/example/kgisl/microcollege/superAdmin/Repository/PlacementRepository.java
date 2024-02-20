package com.example.kgisl.microcollege.superAdmin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.kgisl.microcollege.superAdmin.Model.Placement;

public interface PlacementRepository extends MongoRepository<Placement, String> {

}
