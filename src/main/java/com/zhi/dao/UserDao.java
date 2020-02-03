package com.zhi.dao;

import com.zhi.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author WenZhi Luo
 * @version 1.0
 * @date 2020/2/2 21:38
 */

@Mapper
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name) values(#{id},#{name})")
    boolean insert(User user);
}
