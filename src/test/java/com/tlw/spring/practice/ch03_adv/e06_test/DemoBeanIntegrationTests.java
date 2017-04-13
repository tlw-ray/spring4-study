package com.tlw.spring.practice.ch03_adv.e06_test;

import com.tlw.spring.practice.ch03_adv.e06_test.TestBean;
import com.tlw.spring.practice.ch03_adv.e06_test.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 唐力伟 on 2017/4/9 14:22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;
    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
