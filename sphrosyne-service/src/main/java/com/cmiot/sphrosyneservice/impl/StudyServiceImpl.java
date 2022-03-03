package com.cmiot.sphrosyneservice.impl;

import com.cmiot.sphrosyne.pojo.Student;
import com.cmiot.sphrosyne.facade.StudyService;
import org.springframework.stereotype.Service;

@Service
public class StudyServiceImpl implements StudyService {
    @Override
    public void testStudy() {
        Student student = new Student();
        student.setName("张三");
        student.setAddress("xxx");
        student.setAge("18");
        System.out.println("---"+student.toString());
    }
}
