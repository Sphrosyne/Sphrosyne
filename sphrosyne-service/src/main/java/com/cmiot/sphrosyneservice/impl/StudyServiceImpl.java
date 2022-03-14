package com.cmiot.sphrosyneservice.impl;

import com.cmiot.sphrosyne.mapper.NetworkStatisticsTaskMapper;
import com.cmiot.sphrosyne.mapper.UserMapper;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;
import com.cmiot.sphrosyne.pojo.Student;
import com.cmiot.sphrosyne.facade.StudyService;
import com.cmiot.sphrosyne.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyServiceImpl implements StudyService {
    @Autowired
    UserMapper userMapper;



    @Override
    public void testStudy() {
        Student student = new Student();
        student.setName("张三");
        student.setAddress("xxx");
        student.setAge("18");
        System.out.println("---"+student.toString());

        System.out.println(("----- selectAll method test2 ------"));
        List<User> userList = userMapper.selectList(null);
        for(User user:userList) {
            System.out.println(user);
        }


    }
}
