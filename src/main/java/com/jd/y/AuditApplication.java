package com.jd.y;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author liuchunli3
 * @Description: 审计系统启动主类
 * @date 2019-03-29 09:26
 */
@MapperScan(basePackages = "com.jd.y.audit.mapper")
@SpringBootApplication
public class AuditApplication extends SpringBootServletInitializer {
    /**
     * 启动日志采集服务
     */
    private final static Logger logger = LoggerFactory.getLogger(AuditApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AuditApplication.class);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }

    /**
     * 主类 jar 启动方式
     *
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AuditApplication.class, args);
        String envActive = context.getEnvironment().getProperty("spring.profiles.active");
        logger.info("====[jar]audit sys start success=====active:" + envActive);
    }
}
