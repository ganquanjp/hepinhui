package com.hph.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hph.bean.resultbean.DeliveryBoxBean;
import com.hph.bean.resultbean.DeliveryBoxDetailBean;
import com.hph.bean.resultbean.DeliveryProductBean;
import com.hph.domain.hepinhui.DeliveryBox;
import com.hph.domain.mapper.hepinhui.DeliveryBoxMapper;
import com.hph.domain.mapper.hepinhui.custmapper.CustDeliveryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryBoxService {

    @Autowired
    CustDeliveryMapper custDeliveryMapper;

    @Autowired
    DeliveryBoxMapper deliveryBoxMapper;

    public List<DeliveryBoxBean> getAllDeliveryBoxs() {
        return custDeliveryMapper.selectAllDelivery();
    }

    public int getDeliveryContentWeight(String deliveryDate, String boxId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("deliveryDate", deliveryDate);
        params.put("boxId", boxId);
        return custDeliveryMapper.selectDeliveryContentWeight(params);
    }

    public List<DeliveryBoxDetailBean> getDeliveryDetails(String deliveryDate, String boxId, int expressFeeJpn,
            int contentWeight) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("deliveryDate", deliveryDate);
        params.put("boxId", boxId);
        params.put("expressFeeJpn", expressFeeJpn);
        params.put("contentWeight", contentWeight);
        return custDeliveryMapper.selectDeliveryDetails(params);
    }

    public List<DeliveryProductBean> getDeliveryProducts() {
        return custDeliveryMapper.selectDeliveryProducts();
    }

    public void updateByPrimaryKeySelective(String deliveryDate, String boxId, String statusId) {
        DeliveryBox record = new DeliveryBox();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            date = sdf.parse(deliveryDate);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        record.setDeliveryDate(date);
        record.setBoxId(boxId);
        record.setStatusId(statusId);
        record.setDeliveryArrivalDate(new Date());
        deliveryBoxMapper.updateByPrimaryKeySelective(record);
    }
}
