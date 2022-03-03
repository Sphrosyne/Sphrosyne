package com.cmiot.sphrosyneservice.web;

import com.cmiot.sphrosyne.facade.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    StudyService studyService;

    @ResponseBody
    @GetMapping("/testStudy")
    public void testStudy() {
        studyService.testStudy();
    }
}
