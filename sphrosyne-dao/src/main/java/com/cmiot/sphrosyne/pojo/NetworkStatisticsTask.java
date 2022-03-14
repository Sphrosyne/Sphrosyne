package com.cmiot.sphrosyne.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author huanzzhang ON 2022/3/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_network_statistics_task")
public class NetworkStatisticsTask {
    private Long id;
    private String name;
    private Integer status;
    private String comment;
}
