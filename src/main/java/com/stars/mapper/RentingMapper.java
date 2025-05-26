package com.stars.mapper;

import com.stars.model.Renting;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

@Mapper
public interface RentingMapper  {
    List<Renting> getAllRenting();//查询所有

    int insertRenting(Renting renting);//添加

    int deleteRenting(String rentingname);//删除
}
