package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.MstExpressCompany;

public interface MstExpressCompanyMapper {
    int deleteByPrimaryKey(String expressCompanyId);

    int insert(MstExpressCompany record);

    int insertSelective(MstExpressCompany record);

    MstExpressCompany selectByPrimaryKey(String expressCompanyId);

    int updateByPrimaryKeySelective(MstExpressCompany record);

    int updateByPrimaryKey(MstExpressCompany record);
}