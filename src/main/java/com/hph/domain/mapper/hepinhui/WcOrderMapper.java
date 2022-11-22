package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.WcOrder;

public interface WcOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(WcOrder record);

    int insertSelective(WcOrder record);

    WcOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(WcOrder record);

    int updateByPrimaryKey(WcOrder record);
}