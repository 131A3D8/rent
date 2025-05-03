package com.stars.service.impl;

import com.stars.mapper.RentingMapper;
import com.stars.model.Renting;
import com.stars.service.IRentingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RentingServiceImpl implements IRentingService {
    @Autowired
    private RentingMapper rentingMapper;
    @Override
    public List<Renting> getAllRenting(){
        return rentingMapper.getAllRenting();//调用RentingMapper层查询所有数据
    }

    @Override
    public int addRenting(Renting renting) {
        return rentingMapper.insertRenting(renting);
    }

    @Override
    public int deleteRenting(String rentingname) {
        return rentingMapper.deleteRenting(rentingname);
    }
}

