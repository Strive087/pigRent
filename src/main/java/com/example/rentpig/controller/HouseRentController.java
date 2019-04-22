package com.example.rentpig.controller;

import com.example.rentpig.entity.HouseRent;
import com.example.rentpig.service.HouseRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HouseRentController {

    @Autowired
    private HouseRentService houseRentService;

    @RequestMapping("/getAllHouseRent")
    public List<HouseRent> getAllHouseRent(){
        return houseRentService.getAllHouseRent();
    }

    @RequestMapping("/getAllHouseRentByUserid")
    public List<HouseRent> getAllHouseRentByUserid(long userid){
        return houseRentService.getAllHouseRentByUserid(userid);
    }

    @RequestMapping("/getHouseRentByHouseid")
    public HouseRent getHouseRentByHouseid(long houseid){
        return houseRentService.getHouseRentByHouseid(houseid);
    }

    @RequestMapping("/getAllHouseRentByOption")
    public List<HouseRent> getAllHouseRentByOption(int lowprice,int upprice , int lowarea , int uparea ){
        List<HouseRent> houseRentList = houseRentService.getAllHouseRent();
        List<HouseRent> houseRentList1 = new ArrayList<>();
        for (HouseRent houseRent : houseRentList){
            if (lowprice != upprice){
                if(houseRent.getHouseprice() > lowprice && houseRent.getHouseprice() < upprice){
                    if(lowarea != uparea){
                        if(Integer.parseInt(houseRent.getHousearea()) > lowarea && Integer.parseInt(houseRent.getHousearea()) < uparea){
                            houseRentList1.add(houseRent);
                        }
                    }else{
                        houseRentList1.add(houseRent);
                    }
                }
            }else{
                if(lowarea != uparea){
                    if(Integer.parseInt(houseRent.getHousearea()) > lowarea && Integer.parseInt(houseRent.getHousearea()) < uparea){
                        houseRentList1.add(houseRent);
                    }
                }else{
                   return houseRentList;
                }
            }
        }
        return houseRentList1;
    }

    @RequestMapping("/addHouseRent")
    public void addHouseRent(HouseRent houseRent){
        houseRentService.addHouseRent(houseRent);
    }

    @RequestMapping("/deleteHouseRent")
    public void deleteHouseRent(long id){
        houseRentService.deleteHouseRent(id);
    }

    @RequestMapping("/updateHouseRent")
    public void updateHouseRent(HouseRent houseRent){
        houseRentService.updateHouseRent(houseRent);
    }
}
