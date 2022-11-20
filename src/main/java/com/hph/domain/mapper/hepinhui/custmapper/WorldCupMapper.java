package com.hph.domain.mapper.hepinhui.custmapper;

import java.util.List;
import java.util.Map;

import com.hph.bean.resultbean.WorldCupOrderBean;

public interface WorldCupMapper {
    List<WorldCupOrderBean> selectAllOrders(Map<String, Object> params);
}
