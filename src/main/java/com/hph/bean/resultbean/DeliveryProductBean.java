package com.hph.bean.resultbean;

import java.math.BigDecimal;
public class DeliveryProductBean {


    private String barCode;

    private String nameCn;

    private BigDecimal quantity;

    private String deliveryDate;

    private String boxId;

    private BigDecimal expressFeeJpn;
    
    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId;
    }

    public BigDecimal getExpressFeeJpn() {
        return expressFeeJpn;
    }

    public void setExpressFeeJpn(BigDecimal expressFeeJpn) {
        this.expressFeeJpn = expressFeeJpn;
    }


    
}