package com.stars.mapper;

import com.stars.model.Renting;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface RentingMapper  {
    List<Renting> getAllRenting();

    int insertRenting(Renting renting);

    int deleteRenting(String rentingname);
}
