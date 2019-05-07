package com.jd.y.bean.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 审计日志报文结构
 *
 * @author liuchunli3
 * @date 2019/3/29 11:36
 */
@Data
@ApiModel("审计日志结构")
public class AuditLog implements Serializable {
    /**
     * 公共字段
     */
    @ApiModelProperty(value = "通用日志", required = true)
    private CommonLog common_log;
    /**
     * 业务字段 json
     */
    @ApiModelProperty(value = "业务日志 JSON", required = true)
    private String business_log;
    /**
     * 结果数据 json
     */
    @ApiModelProperty(value = "行为结果关键信息 JSON")
    private String result_log;
}
