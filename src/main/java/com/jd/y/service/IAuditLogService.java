package com.jd.y.service;


/**
 * @author liuchunli3
 * @date 2019/4/1 16:22
 */
public interface IAuditLogService {
    public void addLog(String tableName, String logJson);
}
