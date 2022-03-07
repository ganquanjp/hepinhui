package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.MstCurrency;

public interface MstCurrencyMapper {
    int deleteByPrimaryKey(String currencyId);

    int insert(MstCurrency record);

    int insertSelective(MstCurrency record);

    MstCurrency selectByPrimaryKey(String currencyId);

    int updateByPrimaryKeySelective(MstCurrency record);

    int updateByPrimaryKey(MstCurrency record);
}