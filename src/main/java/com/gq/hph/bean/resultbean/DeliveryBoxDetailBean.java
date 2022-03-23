package com.gq.hph.bean.resultbean;

import java.math.BigDecimal;

public class DeliveryBoxDetailBean {

    private String barCode;

    private String nameJp;

    private String nameCn;

    private String packageWeight;

    private String weightUnitId;

    private String unitName;

    private int quantity;

    private int priceJpn;

    private BigDecimal expressFeeCny;

    private BigDecimal priceCny;

    private BigDecimal cifCny;

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getNameJp() {
        return nameJp;
    }

    public void setNameJp(String nameJp) {
        this.nameJp = nameJp;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(String packageWeight) {
        this.packageWeight = packageWeight;
    }

    public String getWeightUnitId() {
        return weightUnitId;
    }

    public void setWeightUnitId(String weightUnitId) {
        this.weightUnitId = weightUnitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceJpn() {
        return priceJpn;
    }

    public void setPriceJpn(int priceJpn) {
        this.priceJpn = priceJpn;
    }

    public BigDecimal getExpressFeeCny() {
        return expressFeeCny;
    }

    public void setExpressFeeCny(BigDecimal expressFeeCny) {
        this.expressFeeCny = expressFeeCny;
    }

    public BigDecimal getPriceCny() {
        return priceCny;
    }

    public void setPriceCny(BigDecimal priceCny) {
        this.priceCny = priceCny;
    }

    public BigDecimal getCifCny() {
        return cifCny;
    }

    public void setCifCny(BigDecimal cifCny) {
        this.cifCny = cifCny;
    }
    
}