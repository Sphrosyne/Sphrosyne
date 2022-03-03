package com.cmiot.sphrosyneservice.until.Common;

public class SeasonEnum {
    private String season;

    public static SeasonEnum SPRING =new SeasonEnum("春天");
    public static SeasonEnum SUMMER =new SeasonEnum("夏天");
    public static SeasonEnum AUTUMN =new SeasonEnum("秋天");
    public static SeasonEnum WINTER =new SeasonEnum("冬天");

    private SeasonEnum(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "SeasonEnum{" +
                "season='" + season + '\'' +
                '}';
    }
}
