package com.zhuguang.jack.service;

import java.util.List;
import java.util.Map;

import com.zhuguang.jack.bean.ConsultConfigArea;
import com.zhuguang.jack.bean.ConsultContent;

public interface CommonService {
    
    List<ConsultContent> queryContent(Map map);
    
    //    int updateConsultContract(String psptId, int id);
    //    
    //    List<ConsultContract> queryConsultContract();
    public List<ConsultConfigArea> qryArea(Map param, Map cacheConfig);
    
    int saveArea(ConsultConfigArea area);
    
    int saveAreaToBase(ConsultConfigArea area);
    
    public List<ConsultConfigArea> qryAreaFromBase(Map param);
    
}
