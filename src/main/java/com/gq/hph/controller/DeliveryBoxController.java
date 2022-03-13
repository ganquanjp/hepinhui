package com.gq.hph.controller;

import java.util.ArrayList;
import java.util.List;

import com.gq.hph.bean.DeliveryBoxBean;
import com.gq.hph.service.DeliveryBoxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
