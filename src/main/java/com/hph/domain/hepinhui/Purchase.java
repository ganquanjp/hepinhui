package com.hph.domain.hepinhui;

import java.math.BigDecimal;
import java.util.Date;

public class Purchase {
    private String barCode;

    private BigDecimal priceJpn;

    private BigDecimal quantity;

    private String platformId;

    private String storeId;

    private Date purchaseDate;

    private String purchaseTicketId;

    private String purchaseStatusId;

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public BigDecimal getPriceJpn() {
        return priceJpn;
    }

    public void setPriceJpn(BigDecimal priceJpn) {
        this.priceJpn = priceJpn;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseTicketId() {
        return purchaseTicketId;
    }

    public void setPurchaseTicketId(String purchaseTicketId) {
        this.purchaseTicketId = purchaseTicketId == null ? null : purchaseTicketId.trim();
    }

    public String getPurchaseStatusId() {
        return purchaseStatusId;
    }

    public void setPurchaseStatusId(String purchaseStatusId) {
        this.purchaseStatusId = purchaseStatusId == null ? null : purchaseStatusId.trim();
    }
}