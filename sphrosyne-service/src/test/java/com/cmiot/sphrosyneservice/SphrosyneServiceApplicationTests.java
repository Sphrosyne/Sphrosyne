package com.cmiot.sphrosyneservice;

import com.cmiot.sphrosyne.facade.MultiDatabaseService;
import com.cmiot.sphrosyne.facade.StudyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SphrosyneServiceApplicationTests {
    @Autowired
    StudyService studyService;
    @Autowired
    MultiDatabaseService multiDatabaseService;

    @Test
    void contextLoads() {
        System.out.println("-----");
        multiDatabaseService.testMulti();


/*        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("age",1);
        userMapper.selectList(queryWrapper).forEach(user -> System.out.println(user.getName()));*/
    }

}
