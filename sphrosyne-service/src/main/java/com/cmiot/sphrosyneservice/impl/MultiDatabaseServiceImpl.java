package com.cmiot.sphrosyneservice.impl;

import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.cmiot.sphrosyne.facade.MultiDatabaseService;
import com.cmiot.sphrosyne.facade.StudyService;
import com.cmiot.sphrosyne.facade.TransService;
import com.cmiot.sphrosyne.mapper.NetworkStatisticsTaskMapper;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huanzzhang ON 2022/3/14
 */
@Service
public class MultiDatabaseServiceImpl implements MultiDatabaseService {

    @Resource
    TransService transService;

    @Resource
    StudyService studyService;

    @Override
    @DSTransactional
    public void testMulti() {
        studyService.testStudy();

        transService.getAll();
    }
}
