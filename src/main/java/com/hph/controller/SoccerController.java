package com.hph.controller;

import java.util.ArrayList;
import java.util.List;

import com.hph.bean.resultbean.SoccerOrderBean;
import com.hph.domain.hepinhui.WcOrder;
import com.hph.service.SoccerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class SoccerController extends BaseController {

    @Autowired
    private SoccerService soccerService;

    /**
     * 转到主菜单
     * 
     * @param orderName
     * @return
     */
    @GetMapping("/soccer")
    public ModelAndView gotoSoccerMenu() {
        return setModelAndView("SoccerMenu", "", null);
    }

    /**
     * 转到订单一览画面
     * 
     * @param orderName
     * @return
     */
    @PostMapping("/soccerorderlist")
    public ModelAndView gotoSoccerOrderList(
        @RequestParam(name = "orderName") String orderName,
        @RequestParam(name = "orderStatus") String orderStatus,
        @RequestParam(name = "stageId") String stageId
    ) {
        return setModelAndView(
              "SoccerOrderList"
            , "soccerOrderList"
            , getSoccerOrderList(
                      orderName
                    , orderStatus
                    , stageId
                )
            );
    }
 
    /**
     * 转到下单画面
     * 
     * @param orderName
     * @return
     */
    @PostMapping("/soccerorder")
    public ModelAndView gotoSoccerOrder() {
        return setModelAndView("SoccerOrder", "", null);
    }

    /**
     * 新订单生成
     * 
     * @param orderName
     * @return
     */
    @RequestMapping(value="/newsoccerorder", method=RequestMethod.POST)
    public ModelAndView newSoccerOrder(
        @ModelAttribute WcOrder wcOrder, Model model
    ) {
        wcOrder.setGroupId("001");
        wcOrder.setStatus("0");
        soccerService.newOrder(wcOrder);
        return setModelAndView(
              "SoccerOrderList"
            , "soccerOrderList"
            , getSoccerOrderList(
                      wcOrder.getName()
                    , ""
                    , wcOrder.getCodeId()
                )
            );
    }

    /**
     * 订单一览取得
     * 
     * @return
     */
    private List<SoccerOrderBean> getSoccerOrderList(String orderName, String orderStatus, String stage){
        List<SoccerOrderBean> soccerOrderList = new ArrayList<>();
        soccerOrderList = soccerService.getSoccerOrderList(orderName, orderStatus, stage);
        return soccerOrderList;
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
