package com.stars.service;

import com.stars.model.Renting;
import com.stars.model.Result;

import java.util.List;

public interface IRentingService {

    List<Renting> getAllRenting();

    int addRenting(Renting renting);

    int deleteRenting(String rentingname);

}
