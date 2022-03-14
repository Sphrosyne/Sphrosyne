package com.cmiot.sphrosyneservice.impl;

import com.cmiot.sphrosyne.facade.MultiDatabaseService;
import com.cmiot.sphrosyne.facade.StudyService;
import com.cmiot.sphrosyne.mapper.NetworkStatisticsTaskMapper;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huanzzhang ON 2022/3/14
 */
@Service
public class MultiDatabaseServiceImpl implements MultiDatabaseService {
    @Autowired
    NetworkStatisticsTaskMapper networkStatisticsTaskMapper;

    @Autowired
    StudyService studyService;

    @Override
    public void testMulti() {
        studyService.testStudy();

        System.out.println(("----- selectAll method test ------"));
        List<NetworkStatisticsTask> networkStatisticsTaskList = networkStatisticsTaskMapper.selectList(null);
        for(NetworkStatisticsTask networkStatisticsTask:networkStatisticsTaskList) {
            System.out.println(networkStatisticsTask);
        }
    }
}
