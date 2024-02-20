package com.example.kgisl.microcollege.superAdmin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.kgisl.microcollege.superAdmin.Model.Drive;
import com.example.kgisl.microcollege.superAdmin.Payload.DriveCreateReq;
import com.example.kgisl.microcollege.superAdmin.Repository.DriveRepository;
import com.example.kgisl.microcollege.superAdmin.Services.DriveServices;

public class DriveController {

    @RestController
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/superadmin/drive", produces = "application/json")

    public class CompanyContoller {
        @Autowired
        DriveRepository driveRepository;

        @PostMapping("/create")
        public String createListing(@RequestBody DriveCreateReq createData) {
            DriveServices DriveServices = new DriveServices(driveRepository);
            String retunData = DriveServices.createDrive(createData);
            return retunData;

        }

        @GetMapping("/get/{driveId}")
        public Drive getrive(@PathVariable String driveId) {
            DriveServices driveService = new DriveServices(driveRepository);
            Drive driveData = driveService.getDrive(driveId);
            return driveData;
        }

        @GetMapping("/getall")
        public List<Drive> getAllrive() {
            DriveServices driveService = new DriveServices(driveRepository);
            List<Drive> driveData = driveService.getall();
            return driveData;
        }
    }

}
