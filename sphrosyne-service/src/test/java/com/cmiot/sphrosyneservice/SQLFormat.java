package com.cmiot.sphrosyneservice;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.visitor.VisitorFeature;
import org.junit.jupiter.api.Test;

public class SQLFormat {

    @Test
    public void sqlFormat() {
        System.out.println(SQLUtils.formatMySql(getSQL()));

//        System.out.println(SQLUtils.formatMySql(getSQL(),new SQLUtils.FormatOption(VisitorFeature.OutputUCase)));
    }

    private String getSQL() {
        String sql = "";
        return sql;
    }
}
