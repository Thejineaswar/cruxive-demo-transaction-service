package com.thejin.prototype.demotransationservice.dto;

import java.math.BigDecimal;

public class CoreBankRequest {
    
    private String fromMobileNumber;
    private String fromAccountNumber;
    private String toAccountNumber;
    private String fromIFSCCode;
    private String toIFSCCode;
    private BigDecimal transactionAmount;
    
    public CoreBankRequest() {}
    
    public CoreBankRequest(String fromMobileNumber, String fromAccountNumber, String toAccountNumber, 
                          String fromIFSCCode, String toIFSCCode, BigDecimal transactionAmount) {
        this.fromMobileNumber = fromMobileNumber;
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.fromIFSCCode = fromIFSCCode;
        this.toIFSCCode = toIFSCCode;
        this.transactionAmount = transactionAmount;
    }
    
    public String getFromMobileNumber() {
        return fromMobileNumber;
    }
    
    public void setFromMobileNumber(String fromMobileNumber) {
        this.fromMobileNumber = fromMobileNumber;
    }
    
    public String getFromAccountNumber() {
        return fromAccountNumber;
    }
    
    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }
    
    public String getToAccountNumber() {
        return toAccountNumber;
    }
    
    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }
    
    public String getFromIFSCCode() {
        return fromIFSCCode;
    }
    
    public void setFromIFSCCode(String fromIFSCCode) {
        this.fromIFSCCode = fromIFSCCode;
    }
    
    public String getToIFSCCode() {
        return toIFSCCode;
    }
    
    public void setToIFSCCode(String toIFSCCode) {
        this.toIFSCCode = toIFSCCode;
    }
    
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }
    
    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}