package com.gq.hph.bean.resultbean;

import java.math.BigDecimal;
import java.util.Date;

public class DeliveryBoxBean {

    private Date deliveryDate;

    private String boxId;

    private String deliveryTicketId;

    private BigDecimal expressFeeJpn;

    private String expressCompanyName;

    private BigDecimal boxWeight;

    private String unitName;

    private String statusId;

    private String statusName;

    private String receiverName;

    private String receiverAddress;

    private String receiverPhone;

    private Date deliveryArrivalDate;

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
        this.boxId = boxId;
    }

    public String getDeliveryTicketId() {
        return deliveryTicketId;
    }

    public void setDeliveryTicketId(String deliveryTicketId) {
        this.deliveryTicketId = deliveryTicketId;
    }

    public BigDecimal getExpressFeeJpn() {
        return expressFeeJpn;
    }

    public void setExpressFeeJpn(BigDecimal expressFeeJpn) {
        this.expressFeeJpn = expressFeeJpn;
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
    }

    public BigDecimal getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(BigDecimal boxWeight) {
        this.boxWeight = boxWeight;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public Date getDeliveryArrivalDate() {
        return deliveryArrivalDate;
    }

    public void setDeliveryArrivalDate(Date deliveryTicketPhoto) {
        this.deliveryArrivalDate = deliveryArrivalDate;
    }
}