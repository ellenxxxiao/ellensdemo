package com.example.ellensdemo.serviceImpl;

import com.example.ellensdemo.bean.UserBean;
import com.example.ellensdemo.mapper.UserMapper;
import com.example.ellensdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
