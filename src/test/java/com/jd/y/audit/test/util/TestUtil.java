package com.jd.y.audit.test.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jd.y.audit.utils.SqlUtil;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liuchunli3
 * @date 2019/3/29 11:50
 */
public class TestUtil {

    @Test
    public void testJsonStrToMap() {
        String str = "{\"took\":0,\"timed_out\":false,\"_shards\":{\"total\":2,\"successful\":2,\"skipped\":0,\"failed\":0},\"_clusters\":{\"total\":0,\"successful\":0,\"skipped\":0},\"hits\":{\"total\":0,\"max_score\":null,\"hits\":[]}}";
        //第一种方式
        JSONObject jsonObj = new JSONObject(true);
        Map maps= jsonObj.parseObject(str, LinkedHashMap.class);
        System.out.println("这个是用JSON类来解析JSON字符串!!!"+maps);
        for (Object map : maps.entrySet()) {
            System.out.println(((Map.Entry) map).getKey() + "     " + ((Map.Entry) map).getValue());
        }
        System.out.println(str);
    }

    @Test
    public void testSql(){
        String json = "{\"vrs_return_supplier_code\":\"19827312\",\"sku_id\":\"22123\",\"dc_id\":21230,\"oper_erp\":\"wangchang12\",\"oper_time\":\"2019-02-09\"}";
        Map maps= JSON.parseObject(json, LinkedHashMap.class);
        String sql = SqlUtil.insertSql("default","table1",maps);
        System.out.println(sql);
    }
}
