package com.nicole.demo.mapper;

import com.nicole.demo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
 * author: Nicole
 * email : nicolechen412@163.com
 * date  : 2019/2/3 下午5:35
 * desc  :
 */
@Mapper
public interface UserMapper {

    @Select({
            "select * from user"
    })
    List<User> listAll();

    @Insert({
            "insert into user(`username`,`password`) values(#{username},#{password})"
    })
    int insert(User user);

    @Delete({
            "delete from user where id = #{userId}"
    })
    int remove(Integer userId);

    @Update({
            "update user set username = #{username}, password = #{password} where id = #{id}"
    })
    int update(User user);
}
