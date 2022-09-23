package com.hph.domain.mapper.hepinhui.custmapper;

import java.util.List;
import java.util.Map;

import com.hph.bean.resultbean.DeliveryBoxBean;
import com.hph.bean.resultbean.DeliveryBoxDetailBean;
import com.hph.bean.resultbean.DeliveryProductBean;

public interface CustDeliveryMapper {
    List<DeliveryBoxBean> selectAllDelivery(Map<String, Object> params);

    //List<DeliveryBoxBean> selectDeliveryByStatus(String status);

    int selectDeliveryContentWeight(Map<String, Object> params);

    List<DeliveryBoxDetailBean> selectDeliveryDetails(Map<String, Object> params);

    List<DeliveryProductBean> selectDeliveryProducts();
}
