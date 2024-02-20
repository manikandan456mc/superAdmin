package com.example.kgisl.microcollege.superAdmin.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.kgisl.microcollege.superAdmin.Payload.PlacementCreateReq;
import com.example.kgisl.microcollege.superAdmin.Services.Common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Document(collection = "Placement")
public class Placement {

    @Transient
    public static final String shortCode = "PL";
    @Id
    public String id;
    public String studentName;
    public String email;
    public List<String> companyPlaced;
    public List<String> driveAttended;
    public String domain;
    public String batch;
    public String branch;
    public Date created;
    public Date updated;

    public Placement(PlacementCreateReq placementCreateReq) {
        this.id = Common.generateSequence(shortCode);
        this.studentName = placementCreateReq.studentName;
        this.email = placementCreateReq.email;
        this.domain = placementCreateReq.domain;
        this.batch = placementCreateReq.batch;
        this.branch = placementCreateReq.branch;
        this.created = new Date();
        this.updated = new Date();
        if (this.driveAttended != null && this.driveAttended.size() > 0) {
            this.driveAttended.add(placementCreateReq.driveId);
        } else {
            this.driveAttended = new ArrayList<>();
            this.driveAttended.add(placementCreateReq.driveId);
        }

        if (placementCreateReq.Placed) {
            if (this.companyPlaced != null && this.companyPlaced.size() > 0) {

                this.companyPlaced.add(placementCreateReq.companyID);
            } else {
                this.companyPlaced = new ArrayList<>();
                this.companyPlaced.add(placementCreateReq.companyID);
            }
        }

    }

}
