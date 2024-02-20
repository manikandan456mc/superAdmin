package com.example.kgisl.microcollege.superAdmin.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.kgisl.microcollege.superAdmin.Payload.CompanyCreateReq;
import com.example.kgisl.microcollege.superAdmin.Services.Common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Document(collection = "Company")
public class Company {

    @Transient
    public static final String shortCode = "COM";
    @Id
    public String id;
    public String name;
    public String Address;
    public String email;
    public String website;
    public String mobileNumber;
    public Date created;
    public Date updated;

    public Company(CompanyCreateReq companyCreateReq) {

        this.id = Common.generateSequence(shortCode);
        this.name = companyCreateReq.name;
        this.Address = companyCreateReq.email;
        this.email = companyCreateReq.email;
        this.mobileNumber = companyCreateReq.mobileNumber;
        this.website = companyCreateReq.website;
        this.created = new Date();
        this.updated = new Date();
    }

}
