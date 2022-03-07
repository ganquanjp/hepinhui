package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.MstRegion;

public interface MstRegionMapper {
    int deleteByPrimaryKey(String regionId);

    int insert(MstRegion record);

    int insertSelective(MstRegion record);

    MstRegion selectByPrimaryKey(String regionId);

    int updateByPrimaryKeySelective(MstRegion record);

    int updateByPrimaryKey(MstRegion record);
}