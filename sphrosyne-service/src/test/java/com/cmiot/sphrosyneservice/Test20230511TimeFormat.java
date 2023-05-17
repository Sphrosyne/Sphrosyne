package com.cmiot.sphrosyneservice;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;


public class Test20230511TimeFormat {
    private static String SPLIT = "#@";

    @Test
    public void format1() {
        String body = "May 12 13:53:24 eeb731f5b672 Oracle Audit[13578]: LENGTH: \"297\" SESSIONID:[5] \"53298\" ENTRYID:[2] \"28\" STATEMENT:[3] \"384\" USERID:[6] \"SYSTEM\" USERHOST:[24] \"WORKGROUP\\CQCA202211615N\" TERMINAL:[14] \"CQCA202211615N\" ACTION:[1] \"3\" RETURNCODE:[1] \"0\" OBJ$CREATOR:[4] \"TEST\" OBJ$NAME:[4] \"user\" OS$USERID:[9] \"202211615\" DBID:[10] \"1384114315\" PRIV$USED:[2] \"47\"";
        System.out.println(body);
        String replaceBody = body.replace("Oracle Audit", SPLIT + "Oracle Audit")
                .replace("LENGTH", SPLIT + "LENGTH")
                .replace("SESSIONID", SPLIT + "SESSIONID")
                .replace("ENTRYID", SPLIT + "ENTRYID")
                .replace("STATEMENT", SPLIT + "STATEMENT")
                .replace("USERID", SPLIT + "USERID")
                .replace("USERHOST", SPLIT + "USERHOST")
                .replace("TERMINAL", SPLIT + "TERMINAL")
                .replace("ACTION", SPLIT + "ACTION")
                .replace("RETURNCODE", SPLIT + "RETURNCODE")
                .replace("OBJ$CREATOR", SPLIT + "OBJ$CREATOR")
                .replace("OBJ$NAME", SPLIT + "OBJ$NAME")
                .replace("OS$USERID", SPLIT + "OS$USERID")
                .replace("DBID", SPLIT + "DBID")
                .replace("PRIV$USED", SPLIT + "PRIV$USED");
        String[] split = replaceBody.split(SPLIT);
        StringBuilder time = new StringBuilder();
        AtomicInteger i = new AtomicInteger();
        Arrays.stream(split[0].split("\\s")).limit(3).forEach(k ->
        {
            if (i.get() == 2) {
                time.append(LocalDate.now().getYear() + " ");
            }
            time.append(k + " ");
            i.getAndIncrement();
        });
        System.out.println(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d yyyy h:m:s ", Locale.ENGLISH);
        try {
            Date date = dateFormat.parse(time.toString());
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = dateFormat.format(date);
            System.out.println(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void format2() {
        String time = "2023-05-15T01:40:10.006301Z";
        System.out.println(parseUTC(time));
    }

    public static String parseUTC(String utcDate) {
        SimpleDateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS Z");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        utcDate = utcDate.replace("Z", " UTC"); //注意UTC前有空格
        try {
            Date date = utcFormat.parse(utcDate);
            // 东8区时间+8
//            Calendar calendar=Calendar.getInstance();
//            calendar.setTime(date);
//            calendar.add(Calendar.HOUR_OF_DAY, 8);
//            Date time = calendar.getTime();
            return sdf.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sdf.format(new Date());
    }
}
