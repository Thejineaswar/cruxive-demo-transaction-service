package com.thejin.prototype.demotransationservice.dto;

public class CoreBankResponse {
    
    private String responseCode;
    private String responseMessage;
    private String transactionReference;
    
    public CoreBankResponse() {}
    
    public CoreBankResponse(String responseCode, String responseMessage, String transactionReference) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.transactionReference = transactionReference;
    }
    
    public String getResponseCode() {
        return responseCode;
    }
    
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    
    public String getResponseMessage() {
        return responseMessage;
    }
    
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
    
    public String getTransactionReference() {
        return transactionReference;
    }
    
    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }
}