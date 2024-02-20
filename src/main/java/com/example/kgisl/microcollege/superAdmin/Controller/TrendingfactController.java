// package com.example.kgisl.microcollege.superAdmin.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import
// com.example.kgisl.microcollege.superAdmin.Payload.TrendingFactCreateReq;
// import
// com.example.kgisl.microcollege.superAdmin.Repository.TrendingFactRepository;
// import
// com.example.kgisl.microcollege.superAdmin.Services.TrendingFactServices;

// @RestController
// @CrossOrigin(origins = "*", maxAge = 3600)
// @RequestMapping(value = "/superadmin/trendingfact", produces =
// "application/json")

// public class TrendingfactController {
// @Autowired
// TrendingFactRepository trendingFactRepository;

// @PostMapping("/create")
// public String createListing(@RequestBody TrendingFactCreateReq createData) {
// TrendingFactServices trendingFactServices = new
// TrendingFactServices(trendingFactRepository);
// String retunData = trendingFactServices.createFact(createData);
// return retunData;

// }

// }
