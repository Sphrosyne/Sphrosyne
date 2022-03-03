package com.cmiot.sphrosyneservice;

import com.cmiot.sphrosyneservice.until.Common.MusicEnum;
import com.cmiot.sphrosyneservice.until.Common.SeasonEnum;

public class Test20210729Enum {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.WINTER);

        System.out.println(MusicEnum.getByType(2).getDesc());

        System.out.println(MusicEnum.getByType(1).getDesc());

        System.out.println(MusicEnum.PHONE.getType());
    }

}
