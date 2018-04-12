package com.zhuguang.jack.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhuguang.jack.service.CommonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring/spring-dispatcher.xml")
public class MyTest {
    
    Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    CommonService service;
    @Test
    public void test1() {
        System.out.println(service.qryArea(null, null));
    }
}
