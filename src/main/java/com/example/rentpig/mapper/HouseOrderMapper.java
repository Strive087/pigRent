package com.example.rentpig.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface HouseOrderMapper {

    @Select("select * from houseorder where sellerid=#{sellerid}")
    List<HouseOrderMapper> getHouseOrderBySellerid(long sellerid);

    @Select("select * from houseorder where buyerid=#{buyerid}")
    List<HouseOrderMapper> getHouseOrderByBuyerid(long buyerid);

    @Insert("insert into houseorder(orderdate,orderprice,orderday,orderstatu,houseid,housename,houseprovince," +
            "housecity,housedistrict,housestreet,sellerid,sellerphone,sellername,buyerid,buyerphone,buyername)" +
            " valuse(#{orderdate},#{orderprice},#{orderday},#{orderstatu},#{houseid},#{housename},#{houseprovince}," +
            "#{housecity},#{housedistrict},#{housestreet},#{sellerid},#{sellerphone},#{sellername},#{buyerid},#{buyerphone},#{buyername})")
    @Options(useGeneratedKeys = true, keyProperty = "orderid", keyColumn = "orderid")
    void addHouseOrder(HouseOrderMapper houseOrder);

    @Update("update houseorder orderstatu=#{orderstatu} where orderid=#{orderid}")
    void updateHouseOrder(HouseOrderMapper houseOrder);

    @Delete("delete * from houseorder where orderid=#{orderid}")
    void deleteoHouseOrder(long orderid);

}
