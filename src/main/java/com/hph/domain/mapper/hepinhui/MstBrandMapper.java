package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.MstBrand;

public interface MstBrandMapper {
    int deleteByPrimaryKey(String brandId);

    int insert(MstBrand record);

    int insertSelective(MstBrand record);

    MstBrand selectByPrimaryKey(String brandId);

    int updateByPrimaryKeySelective(MstBrand record);

    int updateByPrimaryKey(MstBrand record);
}