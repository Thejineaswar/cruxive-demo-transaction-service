package com.thejin.prototype.demotransationservice.dto;

public class CoreBankResponse {
    
    private String responseCode;
    private String transactionReference;
    private String responseMessage;
    
    public CoreBankResponse() {}
    
    public CoreBankResponse(String responseCode, String transactionReference, String responseMessage) {
        this.responseCode = responseCode;
        this.transactionReference = transactionReference;
        this.responseMessage = responseMessage;
    }
    
    public String getResponseCode() {
        return responseCode;
    }
    
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    
    public String getTransactionReference() {
        return transactionReference;
    }
    
    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }
    
    public String getResponseMessage() {
        return responseMessage;
    }
    
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}