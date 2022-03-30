package com.hph.domain.hepinhui;

import java.math.BigDecimal;

public class Stock {
    private String barCode;

    private BigDecimal quantity;

    private BigDecimal priceJpn;

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