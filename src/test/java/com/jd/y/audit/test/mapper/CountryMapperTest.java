package com.jd.y.audit.test.mapper;

import com.jd.y.audit.mapper.CountryMapper;
import com.jd.y.audit.bean.po.Country;
import com.jd.y.audit.test.common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryMapperTest extends BaseTest {
    @Autowired
    CountryMapper countryMapper;

    @Test
    public void testAdd() {
        Country country = new Country();
        country.setName("中国2");
        countryMapper.insert(country);
    }
}
