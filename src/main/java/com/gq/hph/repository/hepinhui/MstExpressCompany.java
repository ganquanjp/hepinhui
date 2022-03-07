package com.gq.hph.repository.hepinhui;

public class MstExpressCompany {
    private String expressCompanyId;

    private String expressCompanyName;

    public String getExpressCompanyId() {
        return expressCompanyId;
    }

    public void setExpressCompanyId(String expressCompanyId) {
        this.expressCompanyId = expressCompanyId == null ? null : expressCompanyId.trim();
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName == null ? null : expressCompanyName.trim();
    }
}