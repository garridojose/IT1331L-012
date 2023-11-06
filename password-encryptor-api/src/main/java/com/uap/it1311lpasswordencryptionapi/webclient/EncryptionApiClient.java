package com.uap.it1311lpasswordencryptionapi.webclient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.uap.it1311lpasswordencryptionapi.models.EncryptionResponse;

@HttpExchange
public interface EncryptionApiClient {
    @GetExchange("/encryptstring?secretKey={secretKey}&plainText={plainText}&cryptAlgorithm={cryptAlgorithm}")
    public EncryptionResponse encrypt(@PathVariable String secretKey, 
    		@PathVariable String plainText, 
    		@PathVariable String cryptAlgorithm);
}
