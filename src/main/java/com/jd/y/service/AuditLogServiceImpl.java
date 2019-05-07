package com.jd.y.service;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author liuchunli3
 * @date 2019/4/1 16:32
 */
@Service
public class AuditLogServiceImpl implements IAuditLogService {
    @Override
    public void addLog(String tableName, String logJson) {
        Map maps= JSON.parseObject(logJson, LinkedHashMap.class);
    }
}
