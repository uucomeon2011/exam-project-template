package com.jd.y.audit.test.common;

import com.jd.y.AuditApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
/*import org.springframework.transaction.annotation.Transactional;*/

/**
 * @Auther: liuchunli3
 * @Date: 2019/1/28 16:40
 * @Description: 测试基类
 */
@ActiveProfiles(value = "dev")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuditApplication.class)
/*@Transactional*/
public class BaseTest {
}
