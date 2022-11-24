package com.hph.domain.mapper.hepinhui.custmapper;

import java.util.List;
import java.util.Map;

import com.hph.bean.resultbean.SoccerOrderBean;

public interface SoccerMapper {
    List<SoccerOrderBean> selectAllOrders(Map<String, Object> params);
}
