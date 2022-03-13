package com.gq.hph.repository.mapper.hepinhui;

import com.gq.hph.repository.hepinhui.DeliveryBox;
import java.util.Date;

import org.apache.ibatis.annotations.Param;

public interface DeliveryBoxMapper {
    int deleteByPrimaryKey(@Param("deliveryDate") Date deliveryDate, @Param("boxId") String boxId);

    int insert(DeliveryBox record);

    int insertSelective(DeliveryBox record);

    DeliveryBox selectByPrimaryKey(@Param("deliveryDate") Date deliveryDate, @Param("boxId") String boxId);

    int updateByPrimaryKeySelective(DeliveryBox record);

    int updateByPrimaryKey(DeliveryBox record);

}