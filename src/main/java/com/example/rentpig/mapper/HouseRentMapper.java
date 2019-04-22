package com.example.rentpig.mapper;

import com.example.rentpig.entity.HouseRent;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface HouseRentMapper {

    @Select("select * from houserent ")
    List<HouseRent> getAllHouseRent();

    @Select("select * from houserent where userid=#{userid}")
    List<HouseRent> getAllHouseRentByUserid(long userid);

    @Select("select * from houserent where houseid=#{houseid}")
    HouseRent getHouseRentByHouseid(long houseid);

    @Insert("insert into houserent(housename,housephoto0,housephoto1,housephoto2,housephoto3,housedescription,houseprovince,housecity,housedistrict," +
            "housestreet,houseshape,housearea,houseprice,houselatitude,houselongtitude,userid,username,userphone," +
            "usersex) values(#{housename},#{housephoto0},#{housephoto1},#{housephoto2},#{housephoto3},#{housedescription},#{houseprovince},#{housecity},#{housedistrict}," +
            "#{housestreet},#{houseshape},#{housearea},#{houseprice},#{houselatitude},#{houselongtitude},#{userid}," +
            "#{username},#{userphone},#{usersex})")
    @Options(useGeneratedKeys = true, keyProperty = "houseid", keyColumn = "houseid")
    void addHouseRent(HouseRent houseRent);

    @Delete("delete from houserent where houseid=#{houseid}")
    void deleteHouseRent(long id);

    @Update("update houserent set housename=#{housename},housephoto0=#{housephoto0},housephoto1=#{housephoto1}," +
            "housephoto2=#{housephoto2},housephoto3=#{housephoto3},housedescription=#{housedescription}," +
            "houseprovince=#{houseprovince},housecity=#{housecity},housedistrict=#{housedistrict},housestreet=#{housestreet}," +
            "houseshape=#{houseshape},housearea=#{housearea},houseprice=#{houseprice},houselatitude=#{houselatitude}," +
            "houselongtitude=#{houselongtitude} where houseid=#{houseid}")
    void updateHouseRent(HouseRent houseRent);
}
