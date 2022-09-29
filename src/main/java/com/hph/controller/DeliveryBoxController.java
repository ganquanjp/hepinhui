package com.hph.controller;

import java.util.ArrayList;
import java.util.List;

import com.hph.bean.resultbean.DeliveryBoxBean;
import com.hph.bean.resultbean.DeliveryBoxDetailBean;
import com.hph.bean.resultbean.DeliveryProductBean;
import com.hph.service.DeliveryBoxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DeliveryBoxController extends BaseController {

    @Autowired
    private DeliveryBoxService deliveryBoxService;

    @GetMapping("/getDeliveryBoxs")
    public ModelAndView getDeliveryBoxs(
        @RequestParam(name = "statusId") String statusId
    ) {
        List<DeliveryBoxBean> deliveryBoxList = new ArrayList<>();
        deliveryBoxList = deliveryBoxService.getAllDeliveryBoxs(statusId);
        return setModelAndView("DeliveryBoxList", "deliveryBoxList", deliveryBoxList);
    }

    @GetMapping("/getDeliveryBoxDetails")
    public ModelAndView getDeliveryBoxDetails(
            @RequestParam(name = "deliveryDate") String deliveryDate,
            @RequestParam(name = "boxId") String boxId,
            @RequestParam(name = "expressFeeJpn") String expressFeeJpn) {

        // 获取内容总重量
        int contentWeight = deliveryBoxService.getDeliveryContentWeight(deliveryDate, boxId);

        // 获取详细内容
        List<DeliveryBoxDetailBean> deliveryBoxDetailList = new ArrayList<>();
        deliveryBoxDetailList = deliveryBoxService.getDeliveryDetails(deliveryDate, boxId,
                Integer.parseInt(expressFeeJpn), contentWeight);
        return setModelAndView("DeliveryBoxDetailList", "deliveryBoxList", deliveryBoxDetailList);
    }

    @GetMapping("/getDeliveryProducts")
    public ModelAndView getDeliveryProducts() {

        // 获取详细内容
        List<DeliveryProductBean> deliveryProductList = new ArrayList<>();
        deliveryProductList = deliveryBoxService.getDeliveryProducts();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("deliveryProductList", deliveryProductList);
        // html
        modelAndView.setViewName("DeliveryProductList");
        return setModelAndView("DeliveryProductList", "deliveryProductList", deliveryProductList);
    }

    
    @GetMapping("/UpdateDeliveryBoxStatus")
    public ModelAndView UpdateDeliveryBoxStatus(
        @RequestParam(name = "deliveryDate") String deliveryDate,
        @RequestParam(name = "boxId") String boxId,
        @RequestParam(name = "statusId") String statusId) {

        deliveryBoxService.updateByPrimaryKeySelective(deliveryDate, boxId, statusId);
        List<DeliveryBoxBean> deliveryBoxList = new ArrayList<>();
        deliveryBoxList = deliveryBoxService.getAllDeliveryBoxs(statusId);
        return setModelAndView("DeliveryBoxList", "deliveryBoxList", deliveryBoxList);
    }

    private ModelAndView setModelAndView(String viewName, String attributeName, Object attributeValue){
        // 获取详细内容
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(attributeName, attributeValue);
        // html
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
