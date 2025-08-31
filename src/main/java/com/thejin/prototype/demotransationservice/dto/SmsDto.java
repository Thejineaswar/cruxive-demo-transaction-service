package com.thejin.prototype.demotransationservice.dto;

public class SmsDto {
    
    private String mobile;
    private Double amount;
    private String reference;
    
    public SmsDto() {}
    
    public SmsDto(String mobile, Double amount, String reference) {
        this.mobile = mobile;
        this.amount = amount;
        this.reference = reference;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
}