package com.cmiot.sphrosyneservice.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.cmiot.sphrosyne.mapper.NetworkStatisticsTaskMapper;
import com.cmiot.sphrosyne.mapper.UserMapper;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;
import com.cmiot.sphrosyne.pojo.Student;
import com.cmiot.sphrosyne.facade.StudyService;
import com.cmiot.sphrosyne.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
/*@DSTransactional
@DS("db2")*/
public class StudyServiceImpl implements StudyService {
    @Resource
    UserMapper userMapper;


    @Override
    public void testStudy() {
        /*Student student = new Student();
        student.setName("小吹");
        student.setAddress("xxx");
        student.setAge("16");
        System.out.println("---"+student.toString());
        System.out.println(("----- selectAll method testStudy ------"));
        List<User> userList = userMapper.selectList(null);
        for(User user:userList) {
            System.out.println(user);
        }*/
        User user = new User();
        user.setId(8l);
        user.setName("小吹");
        user.setAge(16);
        user.setAddr("重庆");
        user.setSex("男");
        userMapper.insert(user);
    }
}
