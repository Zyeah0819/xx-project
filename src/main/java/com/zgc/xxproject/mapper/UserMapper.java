package com.zgc.xxproject.mapper;

import com.zgc.xxproject.pojo.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();

}
