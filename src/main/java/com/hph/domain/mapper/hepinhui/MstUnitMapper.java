package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.MstUnit;

public interface MstUnitMapper {
    int deleteByPrimaryKey(String unitId);

    int insert(MstUnit record);

    int insertSelective(MstUnit record);

    MstUnit selectByPrimaryKey(String unitId);

    int updateByPrimaryKeySelective(MstUnit record);

    int updateByPrimaryKey(MstUnit record);
}