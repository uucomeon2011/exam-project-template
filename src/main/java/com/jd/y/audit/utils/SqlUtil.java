package com.jd.y.audit.utils;

import java.util.Date;
import java.util.Map;

/**
 * 拼接SQL工具类
 *
 * @author liuchunli3
 * @date 2019/4/1 16:50
 */
public class SqlUtil {

    public static String insertSql(String dbName, String tableName, Map colValueMap) {
        StringBuffer columnBuffer = new StringBuffer();
        StringBuffer valuesBuffer = new StringBuffer();
        StringBuffer sql = new StringBuffer("INSERT INTO ");
        sql.append(dbName).append(".").append(tableName);
        for (Object map : colValueMap.entrySet()) {
            String key = ((Map.Entry) map).getKey().toString();
            Object value = ((Map.Entry) map).getValue();
            columnBuffer.append(",").append(key);
            generateSqlValues(valuesBuffer,value);
        }
        sql.append("(").append(columnBuffer.substring(1)).append(")")
                .append(" VALUES ")
                .append("(").append(valuesBuffer.substring(1)).append(")");
        return sql.toString();
    }

    private static StringBuffer generateSqlValues(StringBuffer valueSql, Object valueObj) {
        if (valueObj instanceof Integer) {
            int value = (Integer) valueObj;
            valueSql.append(",").append(value);
        } else if (valueObj instanceof String) {
            String value = (String) valueObj;
            valueSql.append(",'").append(value).append("'");
        } else if (valueObj instanceof Double) {
            double value = (Double) valueObj;
            valueSql.append(",").append(value);
        } else if (valueObj instanceof Float) {
            float value = (Float) valueObj;
            valueSql.append(",").append(value);
        } else if (valueObj instanceof Long) {
            long value = (Long) valueObj;
            valueSql.append(",").append(value);
        } else if (valueObj instanceof Boolean) {
            boolean value = (Boolean) valueObj;
            valueSql.append(",").append(value);
        } else if (valueObj instanceof Date) {
            Date value = (Date) valueObj;
            valueSql.append(",'").append(value).append("'");
        }
        return valueSql;
    }
}
