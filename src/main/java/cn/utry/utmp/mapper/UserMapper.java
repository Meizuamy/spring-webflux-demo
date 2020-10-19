package cn.utry.utmp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.utry.utmp.model.User;

@Mapper
public interface UserMapper {
    
    @Select("Select * from user")
    List<User> getUserList();

    @Insert("Insert into user (id,name,address) values (#{user.id},#{user.name},#{user.address})")
    Long saveUser(@Param("user") User user);

}
