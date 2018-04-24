package com.zhuguang.jack.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhuguang.jack.service.CommonService;
import com.zhuguang.jack.service.MyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring/spring-dispatcher.xml")
public class MyTest {
    
    Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    CommonService service;
    
    @Autowired
    MyService MyService;
    
    @Test
    public void test1() {
        Map map = new HashMap();
        map.put("state", "0");
        map.put("areaCode", "107");
        System.out.println(service.qryArea(map, null));
    }
    
    @Test
    public void test2() {
        System.out.println(MyService.getName());
    }
}
