package com.gq.hph.repository.hepinhui;

public class MstBrand {
    private String brandId;

    private String brandNameCn;

    private String brandNameJp;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public String getBrandNameCn() {
        return brandNameCn;
    }

    public void setBrandNameCn(String brandNameCn) {
        this.brandNameCn = brandNameCn == null ? null : brandNameCn.trim();
    }

    public String getBrandNameJp() {
        return brandNameJp;
    }

    public void setBrandNameJp(String brandNameJp) {
        this.brandNameJp = brandNameJp == null ? null : brandNameJp.trim();
    }
}