package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.WcUser;

public interface WcUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(WcUser record);

    int insertSelective(WcUser record);

    WcUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WcUser record);

    int updateByPrimaryKey(WcUser record);
}