package com.example.kgisl.microcollege.superAdmin.Services;

import java.util.List;

import com.example.kgisl.microcollege.superAdmin.Model.Company;
import com.example.kgisl.microcollege.superAdmin.Payload.CompanyCreateReq;
import com.example.kgisl.microcollege.superAdmin.Repository.CompanyRepository;

public class CompanyServices {

    private CompanyRepository companyRepository;

    public CompanyServices(CompanyRepository companyRepository) {

        this.companyRepository = companyRepository;
    }

    public String createCompany(CompanyCreateReq companyCreateReq) {
        Company company = new Company(companyCreateReq);
        companyRepository.save(company);
        return company.id;
    }

    public Company getCompany(String id) {
        Company companyData = companyRepository.findById(id).orElseThrow();
        return companyData;
    }

    public List<Company> getallCompany() {
        List<Company> allCompany = companyRepository.findAll();
        return allCompany;

    }

    public String deleteCompany(String id) {
        companyRepository.deleteById(id);
        return "Deleted";
    }

}
