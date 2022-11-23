package com.hph.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hph.bean.resultbean.WorldCupOrderBean;
import com.hph.domain.hepinhui.WcOrder;
import com.hph.domain.mapper.hepinhui.WcOrderMapper;
import com.hph.domain.mapper.hepinhui.custmapper.WorldCupMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorldCupService {

    @Autowired
    WorldCupMapper worldCupMapper;

    @Autowired
    WcOrderMapper wcOrderMapper;

    public List<WorldCupOrderBean> getWorldCupOrders(String orderName, String orderStatus, String stageId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("orderName", orderName);
        params.put("orderStatus", orderStatus);
        params.put("stageId", stageId);
        return worldCupMapper.selectAllOrders(params);
    }

    public void newOrder(WcOrder wcOrder){
        wcOrderMapper.insert(wcOrder);
    }

    public WcOrder selectOrder(String orderId){
        return wcOrderMapper.selectByPrimaryKey(orderId);
    }

    public void confirmOrder(WcOrder wcOrder){
        wcOrderMapper.updateByPrimaryKeySelective(wcOrder);
    }
}
