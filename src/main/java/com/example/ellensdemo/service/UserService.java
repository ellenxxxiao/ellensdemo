package com.example.ellensdemo.service;

import com.example.ellensdemo.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);

}
