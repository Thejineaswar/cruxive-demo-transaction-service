package com.thejin.prototype.demotransationservice.dto;

public class CoreBankRequest {
    
    private String payerMobile;
    private String payerAccountNo;
    private String payeeAccountNo;
    private String payerIfsc;
    private String payeeIfsc;
    private Double amount;
    
    public CoreBankRequest() {}
    
    public CoreBankRequest(String payerMobile, String payerAccountNo, String payeeAccountNo, 
                          String payerIfsc, String payeeIfsc, Double amount) {
        this.payerMobile = payerMobile;
        this.payerAccountNo = payerAccountNo;
        this.payeeAccountNo = payeeAccountNo;
        this.payerIfsc = payerIfsc;
        this.payeeIfsc = payeeIfsc;
        this.amount = amount;
    }
    
    public String getPayerMobile() {
        return payerMobile;
    }
    
    public void setPayerMobile(String payerMobile) {
        this.payerMobile = payerMobile;
    }
    
    public String getPayerAccountNo() {
        return payerAccountNo;
    }
    
    public void setPayerAccountNo(String payerAccountNo) {
        this.payerAccountNo = payerAccountNo;
    }
    
    public String getPayeeAccountNo() {
        return payeeAccountNo;
    }
    
    public void setPayeeAccountNo(String payeeAccountNo) {
        this.payeeAccountNo = payeeAccountNo;
    }
    
    public String getPayerIfsc() {
        return payerIfsc;
    }
    
    public void setPayerIfsc(String payerIfsc) {
        this.payerIfsc = payerIfsc;
    }
    
    public String getPayeeIfsc() {
        return payeeIfsc;
    }
    
    public void setPayeeIfsc(String payeeIfsc) {
        this.payeeIfsc = payeeIfsc;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}