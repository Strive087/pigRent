package com.example.rentpig.controller;

import com.example.rentpig.entity.HouseOrder;
import com.example.rentpig.mapper.HouseOrderMapper;
import com.example.rentpig.service.HouseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseOrderController {

    @Autowired
    private HouseOrderService houseOrderService;

    @RequestMapping("/getHouseOrderBySellerid")
    public List<HouseOrder> getHouseOrderBySellerid(long sellerid){
        return houseOrderService.getHouseOrderBySellerid(sellerid);
    }

    @RequestMapping("/getHouseOrderByBuyerid")
    public  List<HouseOrder> getHouseOrderByBuyerid(long buyerid){
        return houseOrderService.getHouseOrderByBuyerid(buyerid);
    }

    @RequestMapping("/addHouseOrder")
    public void addHouseOrder(HouseOrder houseOrder){
        houseOrderService.addHouseOrder(houseOrder);
    }

    @RequestMapping("/updateHouseOrder")
    public void updateHouseOrder(long orderid,int orderstatu){
        houseOrderService.updateHouseOrder(orderid,orderstatu);
    }

    @RequestMapping("/deleteoHouseOrder")
    public void deleteoHouseOrder(long orderid){
        houseOrderService.deleteoHouseOrder(orderid);
    }
}

