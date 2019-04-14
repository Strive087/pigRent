package com.example.rentpig.controller;

import com.example.rentpig.entity.HouseRecord;
import com.example.rentpig.service.HouseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseRecordController {

    @Autowired
    private HouseRecordService houseRecordService;

    public List<HouseRecord> getAllHouseRecordByUserid(long userid){
        return houseRecordService.getAllHouseRecordByUserid(userid);
    }

    public void deleteHouseRecord(long orderid){
        houseRecordService.deleteHouseRecord(orderid);
    }
}
