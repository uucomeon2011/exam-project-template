package com.jd.y.audit.test.service;

import com.jd.y.service.IAuditLogService;
import com.jd.y.audit.test.common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liuchunli3
 * @date 2019/4/1 15:35
 */
public class AuditModelServiceTest extends BaseTest {

    @Autowired
    IAuditLogService auditLogService;

    /*@Test
    public void testAddTable() {
        String sql = "CREATE TABLE test04(id UInt16,col1 String,col2 String,create_date date ) ENGINE = MergeTree(create_date, (id), 8192)";
        auditModelService.createTable(sql);
    }*/

    @Test
    public void testAddLog() {
        String sql = "{\n" +
                "\t\t\"id\" : 55,\n" +
                "\t\t\"col1\" : \"name1\",\n" +
                "\t\t\"col2\" : \"name2\",\n" +
                "\t\t\"create_date\" : \"2019-03-31\"\n" +
                "\t}";
        auditLogService.addLog("test02", sql);
    }
}
