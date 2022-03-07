package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.MstExpressCompany;

public interface MstExpressCompanyMapper {
    int deleteByPrimaryKey(String expressCompanyId);

    int insert(MstExpressCompany record);

    int insertSelective(MstExpressCompany record);

    MstExpressCompany selectByPrimaryKey(String expressCompanyId);

    int updateByPrimaryKeySelective(MstExpressCompany record);

    int updateByPrimaryKey(MstExpressCompany record);
}