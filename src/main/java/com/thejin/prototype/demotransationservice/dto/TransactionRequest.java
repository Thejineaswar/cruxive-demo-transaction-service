package com.thejin.prototype.demotransationservice.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Pattern;

public class TransactionRequest {
    
    @NotNull
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must be 10 digits")
    private String payerMobile;
    
    @NotNull
    private String payerAccountNo;
    
    @NotNull
    private String payeeAccountNo;
    
    @NotNull
    private String payerIfsc;
    
    @NotNull
    private String payeeIfsc;
    
    @NotNull
    @Positive(message = "Amount must be positive")
    private Double amount;
    
    public TransactionRequest() {}
    
    public TransactionRequest(String payerMobile, String payerAccountNo, String payeeAccountNo, 
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