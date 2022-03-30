package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.MstRegion;

public interface MstRegionMapper {
    int deleteByPrimaryKey(String regionId);

    int insert(MstRegion record);

    int insertSelective(MstRegion record);

    MstRegion selectByPrimaryKey(String regionId);

    int updateByPrimaryKeySelective(MstRegion record);

    int updateByPrimaryKey(MstRegion record);
}