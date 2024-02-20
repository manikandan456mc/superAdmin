package com.example.kgisl.microcollege.superAdmin.Model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.kgisl.microcollege.superAdmin.Payload.DriveCreateReq;
import com.example.kgisl.microcollege.superAdmin.Services.Common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Document(collection = "Drive")
public class Drive {
    @Transient
    public static final String shortCode = "DRI";

    @Id
    public String id;
    public String companyId;
    public Date date;
    public String venue;
    public String mode;
    public String jd;
    public int noOfVacancy;
    public int packageInLpa;
    public Date created;
    public Date updated;

    public Drive(DriveCreateReq driveCreateReq) {
        this.id = Common.generateSequence(shortCode);
        this.companyId = driveCreateReq.companyId;
        this.date = driveCreateReq.date;
        this.venue = driveCreateReq.venue;
        this.mode = driveCreateReq.mode;
        this.jd = driveCreateReq.jd;
        this.noOfVacancy = driveCreateReq.noOfVacancy;
        this.packageInLpa = driveCreateReq.packageInLpa;
        this.created = new Date();
        this.updated = new Date();
    }

}
