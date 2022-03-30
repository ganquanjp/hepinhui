package com.hph.domain.mapper.hepinhui;

import com.hph.domain.hepinhui.DeliveryDetail;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

public interface DeliveryDetailMapper {
    int deleteByPrimaryKey(@Param("deliveryDate") Date deliveryDate, @Param("boxId") String boxId, @Param("barCode") String barCode);

    int insert(DeliveryDetail record);

    int insertSelective(DeliveryDetail record);

    DeliveryDetail selectByPrimaryKey(@Param("deliveryDate") Date deliveryDate, @Param("boxId") String boxId, @Param("barCode") String barCode);

    int updateByPrimaryKeySelective(DeliveryDetail record);

    int updateByPrimaryKey(DeliveryDetail record);
}