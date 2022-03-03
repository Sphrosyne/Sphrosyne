package com.cmiot.sphrosyneservice.until;

import com.cmiot.sphrosyneservice.until.Common.QuoteConstant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimerUtils {
    /** 获取跟指定日期，间隔几天的日期 */
    public static String oneDay(String date, int blankDays, DateTimeFormatter dtf) {
        LocalDate day = LocalDate.from(dtf.parse(date));
        LocalDate oneDay = day.plusDays(blankDays);
        return oneDay.format(dtf);
    }

    /** 获取当前的时间：2021-07-15 15:27:32 */
    public static String getCurrentYYYYMMDDHHMMSS(DateTimeFormatter dtf){
        return LocalDateTime.now().format(dtf);
    }

    /** 获取当前的时间：2021-07-15 */
    public static String getCurrentYYYYMMDD(DateTimeFormatter dtf){
        return LocalDate.now().format(dtf);
    }

}
