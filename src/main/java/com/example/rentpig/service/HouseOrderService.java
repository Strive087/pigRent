package com.example.rentpig.service;

import com.example.rentpig.entity.HouseOrder;
import com.example.rentpig.mapper.HouseOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HouseOrderService {

    @Autowired
    private HouseOrderMapper houseOrderMapper;

    public List<HouseOrder> getHouseOrderBySellerid(long sellerid){
        return houseOrderMapper.getHouseOrderBySellerid(sellerid);
    }

    public  List<HouseOrder> getHouseOrderByBuyerid(long buyerid){
        return houseOrderMapper.getHouseOrderByBuyerid(buyerid);
    }

    public List<HouseOrder> getAllOrder(){
        return houseOrderMapper.getAllOrder();
    }

    @Transactional
    public void addHouseOrder(HouseOrder houseOrder){
        houseOrderMapper.addHouseOrder(houseOrder);
    }

    @Transactional
    public void updateHouseOrder(long orderid,int orderstatu){
        houseOrderMapper.updateHouseOrder(orderid,orderstatu);
    }

    @Transactional
    public void deleteoHouseOrder(long orderid){
        houseOrderMapper.deleteoHouseOrder(orderid);
    }


}
