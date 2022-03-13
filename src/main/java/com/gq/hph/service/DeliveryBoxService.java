package com.gq.hph.service;

import java.util.List;

import com.gq.hph.bean.DeliveryBoxBean;
import com.gq.hph.repository.mapper.hepinhui.custmapper.CustDeliveryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryBoxService {
        
        @Autowired
        CustDeliveryMapper custDeliveryMapper;
        
        public List<DeliveryBoxBean> getAllDeliveryBoxs() {
            return (List<DeliveryBoxBean>) custDeliveryMapper.selectAllDelivery();
        }

}
