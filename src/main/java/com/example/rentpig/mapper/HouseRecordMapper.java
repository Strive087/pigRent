package com.example.rentpig.mapper;

import com.example.rentpig.entity.HouseRecord;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HouseRecordMapper {

    @Select("select * from houserecord  where userid=#{userid}")
    List<HouseRecord> getAllHouseRecordByUserid(long userid);

    @Delete("delete * from houserecord where orderid=#{orderid}")
    void deleteHouseRecord(long orderid);

}
