package com.thejin.prototype.demotransationservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public class TransactionRequest {
    
    @NotBlank(message = "Payer mobile is required")
    @Pattern(regexp = "^\\d{10}$", message = "Payer mobile must be 10 digits")
    private String payerMobile;
    
    @NotBlank(message = "Payer account number is required")
    private String payerAccountNo;
    
    @NotBlank(message = "Payee account number is required")
    private String payeeAccountNo;
    
    @NotBlank(message = "Payer IFSC is required")
    @Pattern(regexp = "^[A-Z]{4}0[A-Z0-9]{6}$", message = "Invalid payer IFSC format")
    private String payerIfsc;
    
    @NotBlank(message = "Payee IFSC is required")
    @Pattern(regexp = "^[A-Z]{4}0[A-Z0-9]{6}$", message = "Invalid payee IFSC format")
    private String payeeIfsc;
    
    @NotNull(message = "Amount is required")
    @Positive(message = "Amount must be positive")
    private BigDecimal amount;
    
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
    
    public BigDecimal getAmount() {
        return amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}