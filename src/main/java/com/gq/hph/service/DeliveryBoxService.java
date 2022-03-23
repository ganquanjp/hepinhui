package com.gq.hph.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gq.hph.bean.resultbean.DeliveryBoxBean;
import com.gq.hph.bean.resultbean.DeliveryBoxDetailBean;
import com.gq.hph.bean.resultbean.DeliveryProductBean;
import com.gq.hph.repository.mapper.hepinhui.custmapper.CustDeliveryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryBoxService {
        
        @Autowired
        CustDeliveryMapper custDeliveryMapper;
        
        public List<DeliveryBoxBean> getAllDeliveryBoxs() {
            return custDeliveryMapper.selectAllDelivery();
        }

        public int getDeliveryContentWeight(String deliveryDate, String boxId) {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("deliveryDate", deliveryDate);
            params.put("boxId", boxId);
            return custDeliveryMapper.selectDeliveryContentWeight(params);
        }

        public List<DeliveryBoxDetailBean> getDeliveryDetails(String deliveryDate, String boxId, int expressFeeJpn, int contentWeight) {
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
}
