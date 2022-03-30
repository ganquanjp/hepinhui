package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.MstCurrency;

public interface MstCurrencyMapper {
    int deleteByPrimaryKey(String currencyId);

    int insert(MstCurrency record);

    int insertSelective(MstCurrency record);

    MstCurrency selectByPrimaryKey(String currencyId);

    int updateByPrimaryKeySelective(MstCurrency record);

    int updateByPrimaryKey(MstCurrency record);
}