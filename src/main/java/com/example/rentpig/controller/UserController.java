package com.example.rentpig.controller;

import com.example.rentpig.entity.HouseOrder;
import com.example.rentpig.entity.HouseRent;
import com.example.rentpig.entity.User;
import com.example.rentpig.service.HouseOrderService;
import com.example.rentpig.service.HouseRentService;
import com.example.rentpig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private HouseRentService houseRentService;

    @Autowired
    private HouseOrderService houseOrderService;

    @RequestMapping("/verifypassword")
    public boolean verifyPassword(String usermail,String password){
        User user = userService.getUser(usermail);
        if(user.getUserpassword().equals(password)){
            return true;
        } else {
            return false;
        }
    }

    @RequestMapping("/getuserbymail")
    public User getUsers(String usermail){
        return userService.getUser(usermail);
    }

    @RequestMapping("/getalluser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("/adduser")
    public boolean addUser(User user){
        userService.addUser(user);
        return true;
    }

    @RequestMapping("/updateuser")
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping("/deleteuser")
    public void  deleteUser(String usermail){
        userService.deleteUser(usermail);
    }

    @RequestMapping("/gettotal")
    public List<String> getTotal(){
        List<String> stringList = new ArrayList<>();
        List<User> userList = userService.getAllUser();
        stringList.add(userList.size()+"");
        List<HouseRent> houseRentList = houseRentService.getAllHouseRent();
        stringList.add(houseRentList.size()+"");
        List<HouseOrder> houseOrderList = houseOrderService.getAllOrder();
        stringList.add(houseOrderList.size()+"");
        return stringList;
    }
}
