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

@RestController
public class SoccerAdminController extends BaseController {

    @Autowired
    private SoccerService soccerService;
     
    /**
     * 转到管理员主画面
     * 
     * @param orderName
     * @return
     */
    @GetMapping("/socceradmin")
    public ModelAndView SoccerAdmin() {
        return setModelAndView("SoccerAdminMenu", "", null);
    }

   /**
     * 确认中订单一览
     * 
     * @param orderName
     * @return
     */
    @GetMapping("/confirmorderList")
    public ModelAndView getWcConfirmList(
        @RequestParam(name = "orderStatus") String orderStatus
    ) {
        return setModelAndView(
              "SoccerAdminConfirmList"
            , "soccerOrderList"
            , getSoccerOrderList(
                      ""
                    , orderStatus
                    , ""
                )
            );
    }

   /**
     * 转到订单确认画面
     * 
     * @return
     */
    @GetMapping("/confirmorder")
    public ModelAndView ConfirmOrder(
        @RequestParam(name = "orderId") String orderId
    ) {
        WcOrder wcOrder = soccerService.selectOrder(orderId);
        return setModelAndView(
              "SoccerAdminConfirmOrder"
            , "wcOrder"
            , wcOrder
            );
    }

  /**
     * 订单确认更新
     * 
     * @return
     */
    @RequestMapping(value="/socceradminconfirm", method=RequestMethod.POST)
    public ModelAndView confirmOrder(
        @ModelAttribute WcOrder wcOrder, Model model
    ) {
        wcOrder.setStatus("1");
        soccerService.confirmOrder(wcOrder);
        return setModelAndView(
              "SoccerAdminConfirmList"
            , "soccerOrderList"
            , getSoccerOrderList(
                      wcOrder.getName()
                    , "0"
                    , wcOrder.getCodeId()
                )
            );
    }

     /**
     * 结果确认更新
     * 
     * @return
     */
    @RequestMapping(value="/adminconfirmresult", method=RequestMethod.POST)
    public ModelAndView confirmresult(
        @ModelAttribute WcOrder wcOrder, Model model
    ) {
        wcOrder.setStatus("1");
        soccerService.confirmOrder(wcOrder);
        return setModelAndView(
              "SoccerAdminConfirmList"
            , "soccerOrderList"
            , getSoccerOrderList(
                      wcOrder.getName()
                    , "0"
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
