package com.zhuguang.jack.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuguang.jack.bean.ConsultConfigArea;
import com.zhuguang.jack.bean.ConsultContent;
import com.zhuguang.jack.dao.CommonMapper;
import com.zhuguang.jack.springtest.MyAnnotation;

@Service
public class CommonServiceImpl implements CommonService {
    
    @Autowired
    CommonMapper mapper;
    
    public int saveAreaToBase(ConsultConfigArea area) {
        return mapper.saveArea(area);
    }
    
    public List<ConsultConfigArea> qryAreaFromBase(Map param) {
        return mapper.qryArea(param);
    }
    
    public List<ConsultConfigArea> qryArea(Map param, Map cacheConfig) {
        
        List<ConsultConfigArea> areas = mapper.qryArea(param);
        
        return areas;
    }

    public List<ConsultContent> queryContent(Map map) {
        // TODO Auto-generated method stub
        return null;
    }

    public int saveArea(ConsultConfigArea area) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
