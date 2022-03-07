package com.gq.hph.repository.hepinhui;

import java.math.BigDecimal;
import java.util.Date;

public class DeliveryDetail {
    private Date deliveryDate;

    private String boxId;

    private String barCode;

    private BigDecimal quantity;

    private BigDecimal priceJpn;

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getBoxId() {
        return boxId;
    }

    public void setBoxId(String boxId) {
        this.boxId = boxId == null ? null : boxId.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPriceJpn() {
        return priceJpn;
    }

    public void setPriceJpn(BigDecimal priceJpn) {
        this.priceJpn = priceJpn;
    }
}