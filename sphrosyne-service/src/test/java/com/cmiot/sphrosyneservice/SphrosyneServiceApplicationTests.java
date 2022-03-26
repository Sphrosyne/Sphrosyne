package com.cmiot.sphrosyneservice;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cmiot.sphrosyne.facade.MultiDatabaseService;
import com.cmiot.sphrosyne.facade.StudyService;
import com.cmiot.sphrosyne.mapper.NetworkStatisticsTaskMapper;
import com.cmiot.sphrosyne.mapper.UserMapper;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;
import com.cmiot.sphrosyne.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class SphrosyneServiceApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    NetworkStatisticsTaskMapper networkStatisticsTaskMapper;
    @Autowired
    StudyService studyService;
    @Autowired
    MultiDatabaseService multiDatabaseService;

    @Test
    void contextLoads() {
        multiDatabaseService.testMulti();


/*        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age",1);
        userMapper.selectList(queryWrapper).forEach(user -> System.out.println(user.getName()));*/
    }

}
