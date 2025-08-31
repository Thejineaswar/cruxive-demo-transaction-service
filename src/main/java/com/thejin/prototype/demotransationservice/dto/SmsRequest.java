package com.thejin.prototype.demotransationservice.dto;

public class SmsRequest {
    
    private String mobile;
    private String message;
    
    public SmsRequest() {}
    
    public SmsRequest(String mobile, String message) {
        this.mobile = mobile;
        this.message = message;
    }
    
    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}