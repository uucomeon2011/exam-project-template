package com.jd.y.audit.rest;

import com.alibaba.fastjson.JSON;
import com.jd.y.audit.bean.vo.AuditLog;
import com.jd.y.audit.common.ApiResponse;
import io.swagger.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对外REST API
 *
 * @author liuchunli3
 * @date 2019/3/29 11:30
 */
@Api(description = "日志采集接口")
@RestController
public class LogController {

    /**
     * 启动日志采集服务
     */
    private final static Logger logger = LogManager.getLogger(LogController.class);

    @ApiOperation(value = "日志采集", notes = "通过http post的方式推送日志数据")
    @PostMapping("/audit/v1/log")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "auditLog", value = "日志数据", required = true, paramType = "query", dataType = "AuditLog")
    })
    public ApiResponse logCollect(@RequestBody @ApiParam(name = "model", value = "日志信息") AuditLog auditLog) {
        logger.info(JSON.toJSONString(auditLog));
        return ApiResponse.success();
    }
}
