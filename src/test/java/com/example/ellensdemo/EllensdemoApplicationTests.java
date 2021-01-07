package com.example.ellensdemo;

import com.example.ellensdemo.bean.UserBean;
import com.example.ellensdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EllensdemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("a", "a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getUserId());

    }

}

