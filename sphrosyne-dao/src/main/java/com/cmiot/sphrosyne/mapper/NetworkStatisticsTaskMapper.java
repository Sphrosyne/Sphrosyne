package com.cmiot.sphrosyne.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmiot.sphrosyne.pojo.NetworkStatisticsTask;

/**
 * @author huanzzhang ON 2022/3/14
 */

@DS("db1")
public interface NetworkStatisticsTaskMapper extends BaseMapper<NetworkStatisticsTask> {
}
