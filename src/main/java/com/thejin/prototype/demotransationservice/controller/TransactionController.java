package com.thejin.prototype.demotransationservice.controller;

import com.thejin.prototype.demotransationservice.dto.TransactionRequest;
import com.thejin.prototype.demotransationservice.dto.TransactionResponse;
import com.thejin.prototype.demotransationservice.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    
    @Autowired
    private TransactionService transactionService;
    
    @PostMapping("/transfer")
    public ResponseEntity<TransactionResponse> processTransaction(@Valid @RequestBody TransactionRequest request) {
        try {
            TransactionResponse response = transactionService.processTransaction(request);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            TransactionResponse errorResponse = new TransactionResponse("FAILED", null, "Transaction failed: " + e.getMessage());
            return ResponseEntity.badRequest().body (errorResponse);
        }
    }


    @PostMapping("/")
    public void sampleProcess(){
        return;
    }
}