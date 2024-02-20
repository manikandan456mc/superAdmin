package com.example.kgisl.microcollege.superAdmin.Model;

import org.springframework.data.annotation.Transient;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.kgisl.microcollege.superAdmin.Payload.TrendingFactCreateReq;
import com.example.kgisl.microcollege.superAdmin.Services.Common;

import lombok.*;

@Getter
@Setter

@Document(collection = "TrendingFact")
public class TrendingFact {
    @Transient
    public static final String shortCode = "TF";

    @Id
    public String id;
    public String topic;
    public String description;
    public Category category;
    public String imageUrl;
    public Date created;
    public Date updated;

    public TrendingFact(TrendingFactCreateReq createReq) {
        this.id = Common.generateSequence(shortCode);
        this.topic = createReq.topic;
        this.category = createReq.category;
        this.description = createReq.description;
        this.topic = createReq.topic;
        this.imageUrl = createReq.imageUrl;
        this.created = new Date();
        this.updated = new Date();
    }

}
