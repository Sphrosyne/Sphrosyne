package com.cmiot.sphrosyneservice;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.cmiot.sphrosyne.mapper.UserMapper;
import com.cmiot.sphrosyne.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SphrosyneServiceApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        for(User user:userList) {
            System.out.println(user);
        }

    }

}
