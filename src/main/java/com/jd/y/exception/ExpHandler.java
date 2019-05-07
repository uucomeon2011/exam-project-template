package com.jd.y.exception;

import com.jd.y.common.ApiResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常拦截器
 *
 * @author liuchunli3
 * @date 2019-03-29 10:33 2019-03-29 10:34
 */
@ControllerAdvice
public class ExpHandler {

    /**
     *
     */
    private final static Logger logger = LogManager.getLogger(ExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResponse handle(Exception e) {
        logger.error("系统异常:" + e.getMessage());
        return ApiResponse.error(HttpStatus.BAD_REQUEST.value(), "系统异常1");
    }
}
