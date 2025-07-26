package com.thejin.prototype.demotransationservice.dto;

public class SmsRequest {
    
    private String mobile;
    private String sms;
    
    public SmsRequest() {}
    
    public SmsRequest(String mobile, String sms) {
        this.mobile = mobile;
        this.sms = sms;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getSms() {
        return sms;
    }
    
    public void setSms(String sms) {
        this.sms = sms;
    }
}