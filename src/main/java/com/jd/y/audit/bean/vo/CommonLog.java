package com.jd.y.audit.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liuchunli3
 * @date 2019/3/29 11:40
 */
@Data
@ApiModel("通用日志")
public class CommonLog implements Serializable {
    /**系统编码**/
    @ApiModelProperty(value = "系统编码", required = true)
    private String system_code;
    /**行为编码**/
    @ApiModelProperty(value = "行为编码", required = true)
    private String behavior_code;
    /**操作人ERP**/
    @ApiModelProperty(value = "操作人ERP", required = true)
    private String oper_erp;
    /**操作功能描述**/
    @ApiModelProperty(value = "操作功能描述")
    private String oper_func;
    /**供应商操作账号**/
    @ApiModelProperty(value = "供应商操作账号")
    private String oper_supplier;
    /**操作人IP地址**/
    @ApiModelProperty(value = "操作人IP地址")
    private String oper_ip;
    /**操作时间 yyyy-MM-dd HH:mm:ss||yyyy-MM-dd**/
    @ApiModelProperty(value = "操作时间[格式:yyyy-MM-dd HH:mm:ss||yyyy-MM-dd]")
    private String oper_time;
    /**操作类型**/
    @ApiModelProperty(value = "操作类型", required = true)
    private String oper_type;
}
