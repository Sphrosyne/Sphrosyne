package com.cmiot.sphrosyneservice.impl;

import com.cmiot.sphrosyne.facade.TransService;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
/*@DSTransactional
@DS("db1")*/
public class TransServiceImpl implements TransService {
    /*@Resource
    NetworkStatisticsTaskMapper networkStatisticsTaskMapper;*/

    @Override
    public void getAll() {
        System.out.println(("----- selectAll method test getAll------"));
        /*List<NetworkStatisticsTask> networkStatisticsTaskList = networkStatisticsTaskMapper.selectList(null);
        for(NetworkStatisticsTask networkStatisticsTask:networkStatisticsTaskList) {
            System.out.println(networkStatisticsTask);
        }
        throw new RuntimeException();*/
    }
}
