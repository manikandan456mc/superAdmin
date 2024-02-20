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

import com.example.kgisl.microcollege.superAdmin.Model.Company;
import com.example.kgisl.microcollege.superAdmin.Payload.CompanyCreateReq;
import com.example.kgisl.microcollege.superAdmin.Repository.CompanyRepository;
import com.example.kgisl.microcollege.superAdmin.Services.CompanyServices;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/superadmin/company", produces = "application/json")

public class CompanyContoller {
    @Autowired
    CompanyRepository companyRepository;

    @PostMapping("/create")
    public String createListing(@RequestBody CompanyCreateReq createData) {
        CompanyServices companyServices = new CompanyServices(companyRepository);
        String retunData = companyServices.createCompany(createData);
        return retunData;

    }

    @GetMapping("/get/{companyId}")
    public Company getCompany(@PathVariable String companyId) {
        CompanyServices companyServices = new CompanyServices(companyRepository);
        Company companyData = companyServices.getCompany(companyId);
        return companyData;
    }

    @GetMapping("/getall")
    public List<Company> getAllCompany() {
        CompanyServices companyServices = new CompanyServices(companyRepository);
        List<Company> companyData = companyServices.getallCompany();
        return companyData;
    }
}
