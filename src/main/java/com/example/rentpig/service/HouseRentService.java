package com.example.rentpig.service;

import com.example.rentpig.entity.HouseRent;
import com.example.rentpig.mapper.HouseRentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseRentService {

    @Autowired
    private HouseRentMapper houseRentMapper;

    public List<HouseRent> getAllHouseRent(){
        return houseRentMapper.getAllHouseRent();
    }

    public List<HouseRent> getAllHouseRentByUserid(long userid){
        return houseRentMapper.getAllHouseRentByUserid(userid);
    }

    public HouseRent getHouseRentByHouseid(long houseid){
        return houseRentMapper.getHouseRentByHouseid(houseid);
    }

    @Transactional
    public void addHouseRent(HouseRent houseRent){
        houseRentMapper.addHouseRent(houseRent);
    }

    @Transactional
    public void deleteHouseRent(long id){
        houseRentMapper.deleteHouseRent(id);
    }

    @Transactional
    public void updateHouseRent(HouseRent houseRent){
        houseRentMapper.updateHouseRent(houseRent);
    }

}
