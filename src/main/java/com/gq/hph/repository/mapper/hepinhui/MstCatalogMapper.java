package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.MstCatalog;
import org.apache.ibatis.annotations.Param;

public interface MstCatalogMapper {
    int deleteByPrimaryKey(@Param("mainId") String mainId, @Param("secId") String secId);

    int insert(MstCatalog record);

    int insertSelective(MstCatalog record);

    MstCatalog selectByPrimaryKey(@Param("mainId") String mainId, @Param("secId") String secId);

    int updateByPrimaryKeySelective(MstCatalog record);

    int updateByPrimaryKey(MstCatalog record);
}