package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.MstStatus;

public interface MstStatusMapper {
    int deleteByPrimaryKey(String statusId);

    int insert(MstStatus record);

    int insertSelective(MstStatus record);

    MstStatus selectByPrimaryKey(String statusId);

    int updateByPrimaryKeySelective(MstStatus record);

    int updateByPrimaryKey(MstStatus record);
}