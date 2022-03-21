package com.cmiot.sphrosyne.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cmiot.sphrosyne.pojo.User;

@DS("db1")
public interface UserMapper extends BaseMapper<User> {
}
