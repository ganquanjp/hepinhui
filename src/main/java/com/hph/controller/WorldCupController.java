package com.hph.controller;

import java.util.ArrayList;
import java.util.List;

import com.hph.bean.resultbean.WorldCupOrderBean;
import com.hph.service.WorldCupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WorldCupController extends BaseController {

    @Autowired
    private WorldCupService worldCupService;

        /**
     * 订单一览
     * 
     * @param orderName
     * @return
     */
    @GetMapping("/worldcup")
    public ModelAndView getWcOrder() {
        return setModelAndView("WorldCup", "", null);
    }

    /**
     * 订单一览
     * 
     * @param orderName
     * @return
     */
    @GetMapping("/getWorldCupOrder")
    public ModelAndView getWcOrder(
        @RequestParam(name = "orderName") String orderName,
        @RequestParam(name = "orderStatus") String orderStatus,
        @RequestParam(name = "stageId") String stageId
    ) {
        List<WorldCupOrderBean> worldCupOrderList = new ArrayList<>();
        worldCupOrderList = worldCupService.getWorldCupOrders(orderName, orderStatus, stageId);
        return setModelAndView("WorldCupOrderList", "worldCupOrderList", worldCupOrderList);
    }

    /**
     * 设置返回页面
     * 
     * @param viewName
     * @param attributeName
     * @param attributeValue
     * @return
     */
    private ModelAndView setModelAndView(String viewName, String attributeName, Object attributeValue){
        // 获取详细内容
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(attributeName, attributeValue);
        // html
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
