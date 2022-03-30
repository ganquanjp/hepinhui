package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(String barCode);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(String barCode);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}