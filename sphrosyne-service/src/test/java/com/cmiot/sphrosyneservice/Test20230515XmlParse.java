package com.cmiot.sphrosyneservice;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.visitor.VisitorFeature;
import com.baomidou.mybatisplus.annotation.DbType;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;


public class Test20230515XmlParse {
    @Test
    public void xmlParse() {
        // 解析books.xml文件
        // 创建SAXReader的对象reader
        SAXReader reader = new SAXReader();
        try {
            /*如果输入数据是xml字符串*/
            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "  <Audit xmlns=\"http://xmlns.oracle.com/oracleas/schema/dbserver_audittrail-11_2.xsd\"\n" +
                    "   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                    "   xsi:schemaLocation=\"http://xmlns.oracle.com/oracleas/schema/dbserver_audittrail-11_2.xsd\">\n" +
                    "   <Version>11.2</Version>\n" +
                    "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>5</StatementId><EntryId>3</EntryId><Extended_Timestamp>2023-05-15T01:40:01.681904Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><Scn>1721016</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>SELECT * FROM (\n" +
                    "    SELECT t.*, ROWID\n" +
                    "    FROM TEST.TABLE_NAME t\n" +
                    ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>9</StatementId><EntryId>7</EntryId><Extended_Timestamp>2023-05-15T01:40:04.591564Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><TransactionId>0000000000000000</TransactionId><Scn>1721062</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>SELECT * FROM (\n" +
                    "    SELECT t.*, ROWID\n" +
                    "    FROM TEST.TABLE_NAME t\n" +
                    ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>11</StatementId><EntryId>11</EntryId><Extended_Timestamp>2023-05-15T01:40:10.006301Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>8</Stmt_Type><TransactionId>06001800F2030000</TransactionId><Scn>1721133</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Bind> #1(1):1 #2(1):2 #3(18):AAASNnAAEAAAAINAAA</Sql_Bind>\n" +
                    "<Sql_Text>DELETE FROM TEST.TABLE_NAME WHERE COLUMN_NAME = :1  AND COLUMN_NAME2 = :2  AND COLUMN_NAME3 IS NULL AND COLUMN_NAME4 IS NULL AND COLUMN_NAME5 IS NULL AND COLUMN_NAME6 IS NULL AND COLUMN_NAME7 IS NULL AND ROWID LIKE :3  ESCAPE &apos;#&apos;</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>15</StatementId><EntryId>13</EntryId><Extended_Timestamp>2023-05-15T01:40:10.073712Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><TransactionId>06001800F2030000</TransactionId><Scn>1721138</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>SELECT * FROM (\n" +
                    "    SELECT t.*, ROWID\n" +
                    "    FROM TEST.TABLE_NAME t\n" +
                    ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>18</StatementId><EntryId>17</EntryId><Extended_Timestamp>2023-05-15T01:40:18.680925Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>2</Stmt_Type><TransactionId>03001D0001040000</TransactionId><Scn>1721242</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Bind> #1(0):  #2(0):  #3(0):  #4(1):1 #5(1):2 #6(0):  #7(0): </Sql_Bind>\n" +
                    "<Sql_Text>INSERT INTO TEST.TABLE_NAME (COLUMN_NAME, COLUMN_NAME2, COLUMN_NAME3, COLUMN_NAME4, COLUMN_NAME5, COLUMN_NAME6, COLUMN_NAME7) VALUES (:1 , :2 , :3 , :4 , :5 , :6 , :7 )</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>0</StatementId><EntryId>19</EntryId><Extended_Timestamp>2023-05-15T01:40:18.738337Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><TransactionId>03001D0001040000</TransactionId><Scn>1721245</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>SELECT * FROM (\n" +
                    "    SELECT t.*, ROWID\n" +
                    "    FROM TEST.TABLE_NAME t\n" +
                    ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>1</Audit_Type><Session_Id>141340</Session_Id><StatementId>1471</StatementId><EntryId>7346</EntryId><Extended_Timestamp>2023-05-19T07:43:36.916550Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>root</OS_User><Userhost>icTestothers007</Userhost><OS_Process>91164</OS_Process><Terminal>unknown</Terminal><Instance_Number>0</Instance_Number><Object_Schema>SYS</Object_Schema><Object_Name>V_$SESSION</Object_Name><Action>3</Action><Returncode>0</Returncode><Scn>2170609</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>select distinct V$PROCESS.SPID\n" +
                    "from v$session,\n" +
                    "     v$process\n" +
                    "where v$session.username is not null\n" +
                    "  and V$SESSION.PADDR = V$PROCESS.ADDR</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>1</Audit_Type><Session_Id>141340</Session_Id><StatementId>1471</StatementId><EntryId>7347</EntryId><Extended_Timestamp>2023-05-19T07:43:36.916683Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>root</OS_User><Userhost>icTestothers007</Userhost><OS_Process>91164</OS_Process><Terminal>unknown</Terminal><Instance_Number>0</Instance_Number><Object_Schema>SYS</Object_Schema><Object_Name>X$KSUPR</Object_Name><Action>3</Action><Returncode>0</Returncode><Scn>2170609</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>select distinct V$PROCESS.SPID\n" +
                    "from v$session,\n" +
                    "     v$process\n" +
                    "where v$session.username is not null\n" +
                    "  and V$SESSION.PADDR = V$PROCESS.ADDR</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>1</Audit_Type><Session_Id>141340</Session_Id><StatementId>1471</StatementId><EntryId>7348</EntryId><Extended_Timestamp>2023-05-19T07:43:36.916811Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>root</OS_User><Userhost>icTestothers007</Userhost><OS_Process>91164</OS_Process><Terminal>unknown</Terminal><Instance_Number>0</Instance_Number><Object_Schema>SYS</Object_Schema><Object_Name>GV$PROCESS</Object_Name><Action>3</Action><Returncode>0</Returncode><Scn>2170609</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>select distinct V$PROCESS.SPID\n" +
                    "from v$session,\n" +
                    "     v$process\n" +
                    "where v$session.username is not null\n" +
                    "  and V$SESSION.PADDR = V$PROCESS.ADDR</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "<AuditRecord><Audit_Type>1</Audit_Type><Session_Id>141340</Session_Id><StatementId>1471</StatementId><EntryId>7349</EntryId><Extended_Timestamp>2023-05-19T07:43:36.916941Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>root</OS_User><Userhost>icTestothers007</Userhost><OS_Process>91164</OS_Process><Terminal>unknown</Terminal><Instance_Number>0</Instance_Number><Object_Schema>SYS</Object_Schema><Object_Name>V$PROCESS</Object_Name><Action>3</Action><Returncode>0</Returncode><Scn>2170609</Scn><DBID>1384114315</DBID>\n" +
                    "<Sql_Text>select distinct V$PROCESS.SPID\n" +
                    "from v$session,\n" +
                    "     v$process\n" +
                    "where v$session.username is not null\n" +
                    "  and V$SESSION.PADDR = V$PROCESS.ADDR</Sql_Text>\n" +
                    "</AuditRecord>\n" +
                    "</Audit>\n";
            Reader stringReader = new StringReader(xml);
            Document document = reader.read(stringReader);

            // 通过reader对象的read方法加载books.xml文件,获取docuemnt对象。
//            Document document = reader.read(new File("src/main/resources/helowin_ora_59694_1.xml.COMPLETED"));
            // 通过document对象获取根节点bookstore
            Element bookStore = document.getRootElement();
            // 通过element对象的elementIterator方法获取迭代器
            Iterator it = bookStore.elementIterator();
            // 遍历迭代器，获取根节点中的信息（书籍）
            while (it.hasNext()) {
                System.out.println("==========开始遍历某一本书==========");
                Element book = (Element) it.next();
                List<Attribute> bookAttrs = book.attributes();
                for (Attribute attr : bookAttrs) {
                    System.out.println("属性：" + attr.getName() + "---值：" + attr.getValue());
                }
                System.out.println(book.getName());
                /*Iterator itt = book.elementIterator();
                while (itt.hasNext()) {
                    Element node = (Element) itt.next();
                    System.out.println("节点：" + node.getName() + "---值：" + node.getStringValue());
                }*/
                String sql_text = book.elementText("Sql_Text");
                System.out.println(sql_text);
                if (StringUtils.isNotBlank(sql_text)) {
                    String format = SQLUtils.format(sql_text, DbType.ORACLE.toString());
                    String sqlBind = book.elementText("Sql_Bind");
                    if (StringUtils.isNotBlank(sqlBind)) {
                        String[] split = sqlBind.split(" #");
                        for (int i = 0; i < split.length; i++) {
                            String[] splitValue = split[i].split(":");
                            if (splitValue.length > 1) {
                                String value = splitValue[1];
                                format = format.replace(":" + i, value);
                            }
                        }
                    }
                    System.out.println("&&&&" + SQLUtils.formatOracle(format, new SQLUtils.FormatOption(VisitorFeature.OutputUCase)));
                }
                System.out.println("==========结束遍历某一本书==========");
            }
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void xmlParse2() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "  <Audit xmlns=\"http://xmlns.oracle.com/oracleas/schema/dbserver_audittrail-11_2.xsd\"\n" +
                "   xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "   xsi:schemaLocation=\"http://xmlns.oracle.com/oracleas/schema/dbserver_audittrail-11_2.xsd\">\n" +
                "   <Version>11.2</Version>\n" +
                "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>5</StatementId><EntryId>3</EntryId><Extended_Timestamp>2023-05-15T01:40:01.681904Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><Scn>1721016</Scn><DBID>1384114315</DBID>\n" +
                "<Sql_Text>SELECT * FROM (\n" +
                "    SELECT t.*, ROWID\n" +
                "    FROM TEST.TABLE_NAME t\n" +
                ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                "</AuditRecord>\n" +
                "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>9</StatementId><EntryId>7</EntryId><Extended_Timestamp>2023-05-15T01:40:04.591564Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><TransactionId>0000000000000000</TransactionId><Scn>1721062</Scn><DBID>1384114315</DBID>\n" +
                "<Sql_Text>SELECT * FROM (\n" +
                "    SELECT t.*, ROWID\n" +
                "    FROM TEST.TABLE_NAME t\n" +
                ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                "</AuditRecord>\n" +
                "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>11</StatementId><EntryId>11</EntryId><Extended_Timestamp>2023-05-15T01:40:10.006301Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>8</Stmt_Type><TransactionId>06001800F2030000</TransactionId><Scn>1721133</Scn><DBID>1384114315</DBID>\n" +
                "<Sql_Bind> #1(1):1 #2(1):2 #3(18):AAASNnAAEAAAAINAAA</Sql_Bind>\n" +
                "<Sql_Text>DELETE FROM TEST.TABLE_NAME WHERE COLUMN_NAME = :1  AND COLUMN_NAME2 = :2  AND COLUMN_NAME3 IS NULL AND COLUMN_NAME4 IS NULL AND COLUMN_NAME5 IS NULL AND COLUMN_NAME6 IS NULL AND COLUMN_NAME7 IS NULL AND ROWID LIKE :3  ESCAPE &apos;#&apos;</Sql_Text>\n" +
                "</AuditRecord>\n" +
                "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>15</StatementId><EntryId>13</EntryId><Extended_Timestamp>2023-05-15T01:40:10.073712Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><TransactionId>06001800F2030000</TransactionId><Scn>1721138</Scn><DBID>1384114315</DBID>\n" +
                "<Sql_Text>SELECT * FROM (\n" +
                "    SELECT t.*, ROWID\n" +
                "    FROM TEST.TABLE_NAME t\n" +
                ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                "</AuditRecord>\n" +
                "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>18</StatementId><EntryId>17</EntryId><Extended_Timestamp>2023-05-15T01:40:18.680925Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>2</Stmt_Type><TransactionId>03001D0001040000</TransactionId><Scn>1721242</Scn><DBID>1384114315</DBID>\n" +
                "<Sql_Bind> #1(0):  #2(0):  #3(0):  #4(1):1 #5(1):2 #6(0):  #7(0): </Sql_Bind>\n" +
                "<Sql_Text>INSERT INTO TEST.TABLE_NAME (COLUMN_NAME, COLUMN_NAME2, COLUMN_NAME3, COLUMN_NAME4, COLUMN_NAME5, COLUMN_NAME6, COLUMN_NAME7) VALUES (:1 , :2 , :3 , :4 , :5 , :6 , :7 )</Sql_Text>\n" +
                "</AuditRecord>\n" +
                "<AuditRecord><Audit_Type>2</Audit_Type><Session_Id>132968</Session_Id><StatementId>0</StatementId><EntryId>19</EntryId><Extended_Timestamp>2023-05-15T01:40:18.738337Z</Extended_Timestamp><DB_User>TEST</DB_User><OS_User>202217799</OS_User><Userhost>cqca202217799n</Userhost><OS_Process>59694</OS_Process><Instance_Number>0</Instance_Number><Object_Schema>TEST</Object_Schema><Object_Name>TABLE_NAME</Object_Name><Policy_Name>CHK_TEST_TABLE_NAME_XML</Policy_Name><Stmt_Type>1</Stmt_Type><TransactionId>03001D0001040000</TransactionId><Scn>1721245</Scn><DBID>1384114315</DBID>\n" +
                "<Sql_Text>SELECT * FROM (\n" +
                "    SELECT t.*, ROWID\n" +
                "    FROM TEST.TABLE_NAME t\n" +
                ") WHERE ROWNUM &lt;= 501</Sql_Text>\n" +
                "</AuditRecord>\n" +
                "</Audit>\n";
        if (xml.endsWith("</Audit>\n")) {
            System.out.println("---");
        } else {


        }
    }
}
