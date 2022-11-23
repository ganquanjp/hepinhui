package com.hph.controller;

import java.io.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.hph.bean.resultbean.WorldCupOrderBean;
import com.hph.service.WorldCupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@RestController
public class WorldCupController extends BaseController {

    @Autowired
    private WorldCupService worldCupService;

    /**
     * 回主菜单
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
    @GetMapping("/getWorldCupOrderList")
    public ModelAndView getWcOrder(
        @RequestParam(name = "orderName") String orderName,
        @RequestParam(name = "orderStatus") String orderStatus,
        @RequestParam(name = "stageId") String stageId
    ) {
        return setModelAndView(
              "WorldCupOrderList"
            , "worldCupOrderList"
            , getWorldCupOrderList(
                      orderName
                    , orderStatus
                    , stageId
                )
            );
    }
   /**
     * 确认中订单一览
     * 
     * @param orderName
     * @return
     */
    @GetMapping("/getWorldCupConfirmList")
    public ModelAndView getWcConfirmList() {
        return setModelAndView(
              "WorldCupConfirmList"
            , "worldCupOrderList"
            , getWorldCupOrderList(
                      ""
                    , "0"
                    , ""
                )
            );
    }
    /**
     * 转到下单画面
     * 
     * @param orderName
     * @return
     */
    @GetMapping("/doWorldCupOrder")
    public ModelAndView doWorldCupOrder() {
        return setModelAndView("WorldCupOrder", "", null);
    }

    /**
     * 下单画面
     * 
     * @param orderName
     * @return
     */
    @RequestMapping(value="/NewWorldCupOrder", method=RequestMethod.POST)
    public ModelAndView newWorldCupOrder(
        @ModelAttribute WorldCupOrderBean worldCupOrderBean, Model model
    ) {
        worldCupService.newOrder(worldCupOrderBean);
        return setModelAndView(
              "WorldCupOrderList"
            , "worldCupOrderList"
            , getWorldCupOrderList(
                      worldCupOrderBean.getOrderName()
                    , ""
                    , worldCupOrderBean.getStage()
                )
            );
    }

   /**
     * 订单确认更新
     * 
     * @return
     */
    @GetMapping("/ConfirmUpdate")
    public ModelAndView ConfirmUpdate(
        @RequestParam(name = "orderId") String orderId,
        @RequestParam(name = "odds") String odds
    ) {
        WorldCupOrderBean worldCupOrderBean = new WorldCupOrderBean();
        worldCupOrderBean.setOrderId(orderId);
        worldCupOrderBean.setOdds(new BigDecimal(odds));
        worldCupService.confirmOrder(worldCupOrderBean);
        return setModelAndView(
              "WorldCupOrderList"
            , "worldCupOrderList"
            , getWorldCupOrderList(
                      worldCupOrderBean.getOrderName()
                    , ""
                    , worldCupOrderBean.getStage()
                )
            );
    }
    /**
     * 订单一览取得
     * 
     * @return
     */
    private List<WorldCupOrderBean> getWorldCupOrderList(String orderName, String orderStatus, String stage){
        List<WorldCupOrderBean> worldCupOrderList = new ArrayList<>();
        worldCupOrderList = worldCupService.getWorldCupOrders(orderName, orderStatus, stage);
        return worldCupOrderList;
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
