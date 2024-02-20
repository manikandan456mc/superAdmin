package com.example.kgisl.microcollege.superAdmin.Services;

import com.example.kgisl.microcollege.superAdmin.Model.TrendingFact;
import com.example.kgisl.microcollege.superAdmin.Payload.TrendingFactCreateReq;
import com.example.kgisl.microcollege.superAdmin.Repository.TrendingFactRepository;

public class TrendingFactServices {

    private TrendingFactRepository trendingFactRepository;

    public TrendingFactServices(TrendingFactRepository trendingFactRepository) {
        this.trendingFactRepository = trendingFactRepository;

    }

    public String createFact(TrendingFactCreateReq createReq) {
        TrendingFact trendingFact = new TrendingFact(createReq);
        trendingFactRepository.save(trendingFact);
        return trendingFact.id;

    }
}
