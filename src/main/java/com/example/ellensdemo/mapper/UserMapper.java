package com.example.ellensdemo.mapper;

import com.example.ellensdemo.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

//    UserBean getInfo(@Param("name") String name, @Param("password") String password);
    UserBean getInfo(String name, String password);

}
