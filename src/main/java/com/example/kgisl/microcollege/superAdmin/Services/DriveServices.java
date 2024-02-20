package com.example.kgisl.microcollege.superAdmin.Services;

import java.util.List;

import com.example.kgisl.microcollege.superAdmin.Model.Drive;
import com.example.kgisl.microcollege.superAdmin.Payload.DriveCreateReq;
import com.example.kgisl.microcollege.superAdmin.Repository.DriveRepository;

public class DriveServices {

    private DriveRepository driveRepository;

    public DriveServices(DriveRepository driveRepository2) {
        this.driveRepository = driveRepository2;
    }

    public String createDrive(DriveCreateReq createReq) {
        Drive drive = new Drive(createReq);
        Drive driveData = driveRepository.save(drive);
        return driveData.id;
    }

    public Drive getDrive(String driveId) {
        Drive drive = driveRepository.findById(driveId).orElse(null);
        return drive;
    }

    public List<Drive> getall() {
        List<Drive> Alldrive = driveRepository.findAll();
        return Alldrive;
    }

}
