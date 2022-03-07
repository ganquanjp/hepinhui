package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.MstProvider;
import org.apache.ibatis.annotations.Param;

public interface MstProviderMapper {
    int deleteByPrimaryKey(@Param("platformId") String platformId, @Param("storeId") String storeId);

    int insert(MstProvider record);

    int insertSelective(MstProvider record);

    MstProvider selectByPrimaryKey(@Param("platformId") String platformId, @Param("storeId") String storeId);

    int updateByPrimaryKeySelective(MstProvider record);

    int updateByPrimaryKey(MstProvider record);
}