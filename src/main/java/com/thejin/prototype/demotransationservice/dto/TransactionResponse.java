package com.thejin.prototype.demotransationservice.dto;

public class TransactionResponse {
    
    private String responseCode;
    private String transactionReference;
    private String message;
    
    public TransactionResponse() {}
    
    public TransactionResponse(String responseCode, String transactionReference, String message) {
        this.responseCode = responseCode;
        this.transactionReference = transactionReference;
        this.message = message;
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
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}