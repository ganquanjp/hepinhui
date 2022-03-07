package com.gq.hph.repository.hepinhui;

import java.math.BigDecimal;
import java.util.Date;

public class DeliveryBox {
    private Date deliveryDate;

    private String boxId;

    private BigDecimal boxWeight;

    private String weightUnitId;

    private String expressCompanyId;

    private BigDecimal expressFeeJpn;

    private BigDecimal expressBackFeeJpn;

    private String statusId;

    private String deliveryTicketId;

    private String receiverName;

    private String receiverAddress;

    private String receiverPhone;

    private String deliveryTicketPhoto;

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

    public BigDecimal getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(BigDecimal boxWeight) {
        this.boxWeight = boxWeight;
    }

    public String getWeightUnitId() {
        return weightUnitId;
    }

    public void setWeightUnitId(String weightUnitId) {
        this.weightUnitId = weightUnitId == null ? null : weightUnitId.trim();
    }

    public String getExpressCompanyId() {
        return expressCompanyId;
    }

    public void setExpressCompanyId(String expressCompanyId) {
        this.expressCompanyId = expressCompanyId == null ? null : expressCompanyId.trim();
    }

    public BigDecimal getExpressFeeJpn() {
        return expressFeeJpn;
    }

    public void setExpressFeeJpn(BigDecimal expressFeeJpn) {
        this.expressFeeJpn = expressFeeJpn;
    }

    public BigDecimal getExpressBackFeeJpn() {
        return expressBackFeeJpn;
    }

    public void setExpressBackFeeJpn(BigDecimal expressBackFeeJpn) {
        this.expressBackFeeJpn = expressBackFeeJpn;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }

    public String getDeliveryTicketId() {
        return deliveryTicketId;
    }

    public void setDeliveryTicketId(String deliveryTicketId) {
        this.deliveryTicketId = deliveryTicketId == null ? null : deliveryTicketId.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getDeliveryTicketPhoto() {
        return deliveryTicketPhoto;
    }

    public void setDeliveryTicketPhoto(String deliveryTicketPhoto) {
        this.deliveryTicketPhoto = deliveryTicketPhoto == null ? null : deliveryTicketPhoto.trim();
    }
}