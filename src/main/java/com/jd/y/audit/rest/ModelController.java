package com.jd.y.audit.rest;

import com.jd.y.audit.bean.vo.AuditLog;
import com.jd.y.audit.common.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务系统日志模型管理
 *
 * @author liuchunli3
 * @date 2019/3/29 11:30
 */
@RestController
public class ModelController {

    @PostMapping("/v1/model")
    public ApiResponse createTable(@RequestBody String sql) {
        return ApiResponse.success();
    }
}
