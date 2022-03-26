package com.cmiot.sphrosyneservice.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.cmiot.sphrosyne.facade.TransService;
import com.cmiot.sphrosyne.mapper.NetworkStatisticsTaskMapper;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
/*@DSTransactional
@DS("db1")*/
public class TransServiceImpl implements TransService {
    @Resource
    NetworkStatisticsTaskMapper networkStatisticsTaskMapper;

    @Override
    public void getAll() {
        System.out.println(("----- selectAll method test getAll------"));
        List<NetworkStatisticsTask> networkStatisticsTaskList = networkStatisticsTaskMapper.selectList(null);
        for(NetworkStatisticsTask networkStatisticsTask:networkStatisticsTaskList) {
            System.out.println(networkStatisticsTask);
        }
        throw new RuntimeException();
    }
}
