package com.thejin.prototype.demotransationservice.service;

import com.thejin.prototype.demotransationservice.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    
    @Autowired
    private CoreBankService coreBankService;
    
    @Autowired
    private SmsService smsService;
    
    public TransactionResponse processTransaction(TransactionRequest request) {
        CoreBankRequest coreBankRequest = new CoreBankRequest(
            request.getPayerMobile(),
            request.getPayerAccountNo(),
            request.getPayeeAccountNo(),
            request.getPayerIfsc(),
            request.getPayeeIfsc(),
            request.getAmount()
        );
        
        CoreBankResponse coreBankResponse = coreBankService.processTransaction(coreBankRequest);
        
        if ("SUCCESS".equals(coreBankResponse.getResponseCode())) {
            String smsMessage = String.format(
                "Transaction successful! Amount: Rs.%.2f transferred. Reference: %s",
                request.getAmount(),
                coreBankResponse.getTransactionReference()
            );
            
            smsService.sendSms(request.getPayerMobile(), smsMessage);
            
            return new TransactionResponse(
                "SUCCESS",
                coreBankResponse.getTransactionReference(),
                "Transaction processed successfully"
            );
        } else {
            return new TransactionResponse(
                "FAILED",
                null,
                coreBankResponse.getResponseMessage()
            );
        }
    }
}