package com.example.rentpig.service;

import com.example.rentpig.mapper.HouseOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseOrderService {

    @Autowired
    private HouseOrderMapper houseOrderMapper;

    public List<HouseOrderMapper> getHouseOrderBySellerid(long sellerid){
        return houseOrderMapper.getHouseOrderBySellerid(sellerid);
    }

    public  List<HouseOrderMapper> getHouseOrderByBuyerid(long buyerid){
        return houseOrderMapper.getHouseOrderByBuyerid(buyerid);
    }

    @Transactional
    public void addHouseOrder(HouseOrderMapper houseOrder){
        houseOrderMapper.addHouseOrder(houseOrder);
    }

    @Transactional
    public void updateHouseOrder(HouseOrderMapper houseOrder){
        houseOrderMapper.updateHouseOrder(houseOrder);
    }

    @Transactional
    public void deleteoHouseOrder(long orderid){
        houseOrderMapper.deleteoHouseOrder(orderid);
    }


}
