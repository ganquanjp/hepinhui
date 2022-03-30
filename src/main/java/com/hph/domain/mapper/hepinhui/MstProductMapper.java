package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.MstProduct;

public interface MstProductMapper {
    int deleteByPrimaryKey(String barCode);

    int insert(MstProduct record);

    int insertSelective(MstProduct record);

    MstProduct selectByPrimaryKey(String barCode);

    int updateByPrimaryKeySelective(MstProduct record);

    int updateByPrimaryKey(MstProduct record);
}