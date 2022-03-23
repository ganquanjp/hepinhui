package com.gq.hph.repository.mapper.hepinhui.custmapper;

import java.util.List;
import java.util.Map;

import com.gq.hph.bean.resultbean.DeliveryBoxBean;
import com.gq.hph.bean.resultbean.DeliveryBoxDetailBean;
import com.gq.hph.bean.resultbean.DeliveryProductBean;

public interface CustDeliveryMapper {
    List<DeliveryBoxBean> selectAllDelivery();

    int selectDeliveryContentWeight(Map<String, Object> params);

    List<DeliveryBoxDetailBean> selectDeliveryDetails(Map<String, Object> params);

    List<DeliveryProductBean> selectDeliveryProducts();
}
