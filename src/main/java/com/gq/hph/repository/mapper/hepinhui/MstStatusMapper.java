package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.MstStatus;

public interface MstStatusMapper {
    int deleteByPrimaryKey(String statusId);

    int insert(MstStatus record);

    int insertSelective(MstStatus record);

    MstStatus selectByPrimaryKey(String statusId);

    int updateByPrimaryKeySelective(MstStatus record);

    int updateByPrimaryKey(MstStatus record);
}