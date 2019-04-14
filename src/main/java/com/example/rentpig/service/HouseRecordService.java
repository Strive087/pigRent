package com.example.rentpig.service;

import com.example.rentpig.entity.HouseRecord;
import com.example.rentpig.mapper.HouseRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseRecordService {

    @Autowired
    private HouseRecordMapper houseRecordMapper;

    public List<HouseRecord> getAllHouseRecordByUserid(long userid){
        return houseRecordMapper.getAllHouseRecordByUserid(userid);
    }

    @Transactional
    public void deleteHouseRecord(long orderid){
        houseRecordMapper.deleteHouseRecord(orderid);
    }

}
