package com.cmiot.sphrosyneservice.until.Common;

public enum MusicEnum {
    PHONE(1,"手机"),
    IPAD(2,"IPAD平板"),
    MAC(3,"MAC电脑"),
    UNKNOWN(4,"不知道是啥");

    private int type;

    private String desc;

    MusicEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public static MusicEnum getByType(int type){
        for (MusicEnum musicEnum:MusicEnum.values()){
            if(musicEnum.getType() == type){
                return musicEnum;
            }
        }
        return UNKNOWN;
    }

}
