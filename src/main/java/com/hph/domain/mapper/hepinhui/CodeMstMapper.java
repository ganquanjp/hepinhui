package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.CodeMst;
import org.apache.ibatis.annotations.Param;

public interface CodeMstMapper {
    int deleteByPrimaryKey(@Param("groupId") String groupId, @Param("codeId") String codeId);

    int insert(CodeMst record);

    int insertSelective(CodeMst record);

    CodeMst selectByPrimaryKey(@Param("groupId") String groupId, @Param("codeId") String codeId);

    int updateByPrimaryKeySelective(CodeMst record);

    int updateByPrimaryKey(CodeMst record);
}