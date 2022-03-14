package com.gq.hph.controller;

import java.util.ArrayList;
import java.util.List;

import com.gq.hph.bean.DeliveryBoxBean;
import com.gq.hph.bean.DeliveryBoxDetailBean;
import com.gq.hph.service.DeliveryBoxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DeliveryBoxController {

    @Autowired
    private DeliveryBoxService deliveryBoxService;

    @GetMapping("/getDeliveryBoxs")
    public ModelAndView  getDeliveryBox(){
        List<DeliveryBoxBean> deliveryBoxList = new ArrayList<>();
        deliveryBoxList = deliveryBoxService.getAllDeliveryBoxs();
        ModelAndView modelAndView = new ModelAndView();
         modelAndView.addObject("deliveryBoxList", deliveryBoxList);
        // html
        modelAndView.setViewName("DeliveryBoxList");
        return modelAndView;
    }

    @GetMapping("/getDeliveryBoxDetails")
    public ModelAndView  getDeliveryBoxDetails(
        @RequestParam(name = "deliveryDate") String deliveryDate,
        @RequestParam(name = "boxId") String boxId,
        @RequestParam(name = "expressFeeJpn") String expressFeeJpn
        ){

        // 获取内容总重量
        int contentWeight = deliveryBoxService.getDeliveryContentWeight(deliveryDate, boxId);

        // 获取详细内容
        List<DeliveryBoxDetailBean> deliveryBoxDetailList = new ArrayList<>();
        deliveryBoxDetailList = deliveryBoxService.getDeliveryDetails(deliveryDate, boxId, Integer.parseInt(expressFeeJpn), contentWeight);
        ModelAndView modelAndView = new ModelAndView();
         modelAndView.addObject("deliveryBoxDetailList", deliveryBoxDetailList);
        // html
        modelAndView.setViewName("DeliveryBoxDetailList");
        return modelAndView;
    }
}
