package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.Purchase;

public interface PurchaseMapper {
    int insert(Purchase record);

    int insertSelective(Purchase record);
}