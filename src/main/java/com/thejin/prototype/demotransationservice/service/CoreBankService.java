package com.thejin.prototype.demotransationservice.service;

import com.thejin.prototype.demotransationservice.dto.CoreBankRequest;
import com.thejin.prototype.demotransationservice.dto.CoreBankResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoreBankService {
    
    @Value("${corebank.api.url:http://localhost:8081/api/bank/transfer}")
    private String coreBankApiUrl;
    
    private final RestTemplate restTemplate;
    
    public CoreBankService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public CoreBankResponse processTransaction(CoreBankRequest request) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            
            HttpEntity<CoreBankRequest> entity = new HttpEntity<>(request, headers);
            
            ResponseEntity<CoreBankResponse> response = restTemplate.exchange(
                coreBankApiUrl,
                HttpMethod.POST,
                entity,
                CoreBankResponse.class
            );
            
            return response.getBody();
        } catch (Exception e) {
            throw new RuntimeException("Core bank system unavailable: " + e.getMessage());
        }
    }
}