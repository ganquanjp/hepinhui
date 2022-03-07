package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.Purchase;

public interface PurchaseMapper {
    int insert(Purchase record);

    int insertSelective(Purchase record);
}