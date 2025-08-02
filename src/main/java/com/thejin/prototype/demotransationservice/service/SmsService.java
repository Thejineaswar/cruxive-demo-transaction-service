package com.thejin.prototype.demotransationservice.service;

import com.google.gson.Gson;
import com.thejin.prototype.demotransationservice.dto.SmsDto;
import com.thejin.prototype.demotransationservice.dto.SmsRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SmsService {
    
    @Value("${sms.api.url:http://localhost:8082/api/sms/send}")
    private String smsApiUrl;
    
    private final RestTemplate restTemplate;
    
    public SmsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public void sendSms(SmsDto smsDto) {
        try {

            Gson gson = new Gson();

            String body = gson.toJson(smsDto);
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            
            HttpEntity<String> entity = new HttpEntity<>(body, headers);
            
            restTemplate.exchange(
                smsApiUrl,
                HttpMethod.POST,
                entity,
                String.class
            );
        } catch (Exception e) {
            System.err.println("Failed to send SMS: " + e.getMessage());
        }
    }
}