package com.example.rentpig.controller;

import com.example.rentpig.mapper.HouseOrderMapper;
import com.example.rentpig.service.HouseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseOrderController {

    @Autowired
    private HouseOrderService houseOrderService;

    public List<HouseOrderMapper> getHouseOrderBySellerid(long sellerid){
        return houseOrderService.getHouseOrderBySellerid(sellerid);
    }

    public  List<HouseOrderMapper> getHouseOrderByBuyerid(long buyerid){
        return houseOrderService.getHouseOrderByBuyerid(buyerid);
    }

    public void addHouseOrder(HouseOrderMapper houseOrder){
        houseOrderService.addHouseOrder(houseOrder);
    }

    public void updateHouseOrder(HouseOrderMapper houseOrder){
        houseOrderService.updateHouseOrder(houseOrder);
    }

    public void deleteoHouseOrder(long orderid){
        houseOrderService.deleteoHouseOrder(orderid);
    }
}

