package com.example.rentpig.mapper;

import com.example.rentpig.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where usermail = #{usermail}")
    User getUser(String usermail);

    @Select("select * from user")
    List<User> getAllUser();

    @Insert("insert into user(usermail,username,userphone,userpassword,usersex) values(#{usermail}," +
            "#{username},#{userphone},#{userpassword},#{usersex})")
    @Options(useGeneratedKeys = true, keyProperty = "userid", keyColumn = "userid")
    void addUser(User user);

    @Update("update user set username=#{username},usersex=#{usersex},userpassword=#{userpassword}," +
            "userphone=#{userphone},usermail=#{usermail} where userid=#{userid}")
    void updateUser(User user);

    @Delete("delete from user where usermail=#{usermail}")
    void  deleteUser(String usermail);
}
