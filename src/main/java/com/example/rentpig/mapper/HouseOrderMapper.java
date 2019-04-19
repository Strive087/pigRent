package com.example.rentpig.mapper;

import com.example.rentpig.entity.HouseOrder;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface HouseOrderMapper {

    @Select("select * from houseorder where sellerid=#{sellerid}")
    List<HouseOrder> getHouseOrderBySellerid(long sellerid);

    @Select("select * from houseorder where buyerid=#{buyerid}")
    List<HouseOrder> getHouseOrderByBuyerid(long buyerid);

    @Insert("insert into houseorder(orderdate,orderprice,orderday,orderstatu,houseid,housename,houseprovince," +
            "housecity,housedistrict,housestreet,sellerid,sellerphone,sellername,buyerid,buyerphone,buyername)" +
            " values(#{orderdate},#{orderprice},#{orderday},#{orderstatu},#{houseid},#{housename},#{houseprovince}," +
            "#{housecity},#{housedistrict},#{housestreet},#{sellerid},#{sellerphone},#{sellername},#{buyerid},#{buyerphone},#{buyername})")
    @Options(useGeneratedKeys = true, keyProperty = "orderid", keyColumn = "orderid")
    void addHouseOrder(HouseOrder houseOrder);

    @Update("update houseorder set orderstatu=#{param2} where orderid=#{param1}")
    void updateHouseOrder(long orderid,int orderstatu);

    @Delete("delete * from houseorder where orderid=#{orderid}")
    void deleteoHouseOrder(long orderid);

}
