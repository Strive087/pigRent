package com.example.rentpig.controller;

import com.example.rentpig.entity.HouseRent;
import com.example.rentpig.service.HouseRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseRentController {

    @Autowired
    private HouseRentService houseRentService;

    public List<HouseRent> getAllHouseRent(){
        return houseRentService.getAllHouseRent();
    }

    public List<HouseRent> getAllHouseRentByUserid(long userid){
        return houseRentService.getAllHouseRentByUserid(userid);
    }

    public HouseRent getHouseRentByHouseid(long houseid){
        return houseRentService.getHouseRentByHouseid(houseid);
    }

    public void addHouseRent(HouseRent houseRent){
        houseRentService.addHouseRent(houseRent);
    }

    public void deleteHouseRent(long id){
        houseRentService.deleteHouseRent(id);
    }

    public void updateHouseRent(HouseRent houseRent){
        houseRentService.updateHouseRent(houseRent);
    }
}
